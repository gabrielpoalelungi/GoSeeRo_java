package com.goseero.goseero_spring_boot.controller;

import com.goseero.goseero_spring_boot.exceptions.LandmarkInvalidDataException;
import com.goseero.goseero_spring_boot.exceptions.LandmarkNotFoundException;
import com.goseero.goseero_spring_boot.model.Landmark;
import com.goseero.goseero_spring_boot.service.LandmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(value = "/landmarks")
public class LandmarkController {
    @Autowired
    LandmarkService landmarkService;

    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<Landmark>> getAllLandmarks() {
        List<Landmark> landmarkList = landmarkService.getAll();
        return new ResponseEntity<>(landmarkList, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Landmark> getLandmarkById(@PathVariable("id") Long id) {
        Landmark landmark;
        try {
            landmark = landmarkService.getById(id);
        } catch (LandmarkNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GET: Landmark Not Found", e);
        }
        return new ResponseEntity<>(landmark, HttpStatus.OK);
    }

    @PostMapping(value = {"", "/"})
    public ResponseEntity<Landmark> addLandmark(@RequestBody Landmark landmark) {
        Landmark savedLandmark;
        try {
            savedLandmark = landmarkService.add(landmark);
        } catch (LandmarkInvalidDataException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "POST: Invalid Landmark", e);
        }
        return new ResponseEntity<>(savedLandmark, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> deleteLandmark(@PathVariable ("id") Long id) {
        try {
            landmarkService.delete(id);
        } catch (LandmarkNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DELETE: Landmark Not Found", e);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
