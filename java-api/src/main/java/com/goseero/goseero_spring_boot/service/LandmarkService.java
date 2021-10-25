package com.goseero.goseero_spring_boot.service;

import com.goseero.goseero_spring_boot.exceptions.LandmarkInvalidDataException;
import com.goseero.goseero_spring_boot.exceptions.LandmarkNotFoundException;
import com.goseero.goseero_spring_boot.model.Landmark;
import com.goseero.goseero_spring_boot.repository.LandmarkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandmarkService {

    private final LandmarkRepo landmarkRepo;

    @Autowired
    public LandmarkService(LandmarkRepo landmarkRepo) {
        this.landmarkRepo = landmarkRepo;
    }

    public List<Landmark> getAll() {
        return landmarkRepo.findAll();
    }

    public Landmark getById(Long id) throws LandmarkNotFoundException {
        return landmarkRepo.findById(id)
                .orElseThrow(() -> new LandmarkNotFoundException("getById: Landmark Not Found"));
    }

    public Landmark add(Landmark landmark) throws LandmarkInvalidDataException {
        Landmark landmarkToSave = new Landmark();

        // Name
        if (landmark.getNameLandmark() != null && !landmark.getNameLandmark().equals("")) {
            landmarkToSave.setNameLandmark(landmark.getNameLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Name");
        }

        // General Description Text
        if (landmark.getGeneralDescriptionTextLandmark() != null && !landmark.getGeneralDescriptionTextLandmark().equals("")) {
            landmarkToSave.setGeneralDescriptionTextLandmark(landmark.getGeneralDescriptionTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid General Description");
        }

        // Accessibility Rating Text
        if (landmark.getAccessibilityRatingTextLandmark() != null && !landmark.getAccessibilityRatingTextLandmark().equals("")) {
            landmarkToSave.setAccessibilityRatingTextLandmark(landmark.getAccessibilityRatingTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Accessibility Description");
        }

        // Quality Rating Text
        if (landmark.getQualityRatingTextLandmark() != null && !landmark.getQualityRatingTextLandmark().equals("")) {
            landmarkToSave.setQualityRatingTextLandmark(landmark.getQualityRatingTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Quality Description");
        }

        // Trust Rating Text
        if (landmark.getTrustRatingTextLandmark() != null && !landmark.getTrustRatingTextLandmark().equals("")) {
            landmarkToSave.setTrustRatingTextLandmark(landmark.getTrustRatingTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Trust Description");
        }

        // Popularity Rating Text
        if (landmark.getPopularityRatingTextLandmark() != null && !landmark.getPopularityRatingTextLandmark().equals("")) {
            landmarkToSave.setPopularityRatingTextLandmark(landmark.getPopularityRatingTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Popularity Description");
        }

        // Accessibility Star Rating
        if (landmark.getStarRatingAccessibilityLandmark() > 0 && landmark.getStarRatingAccessibilityLandmark() <= 5.0) {
            landmarkToSave.setStarRatingAccessibilityLandmark(landmark.getStarRatingAccessibilityLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Star Rating Accessibility");
        }

        // Quality Star Rating
        if (landmark.getStarRatingQualityLandmark() > 0 && landmark.getStarRatingQualityLandmark() <= 5.0) {
            landmarkToSave.setStarRatingQualityLandmark(landmark.getStarRatingQualityLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Star Rating Quality");
        }

        // Trust Star Rating
        if (landmark.getStarRatingTrustLandmark() > 0 && landmark.getStarRatingTrustLandmark() <= 5.0) {
            landmarkToSave.setStarRatingTrustLandmark(landmark.getStarRatingTrustLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Star Rating Trust");
        }

        // Popularity Star Rating
        if (landmark.getStarRatingPopularityLandmark() > 0 && landmark.getStarRatingPopularityLandmark() <= 5.0) {
            landmarkToSave.setStarRatingPopularityLandmark(landmark.getStarRatingPopularityLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Star Rating Popularity");
        }

        // Latitude
        if (landmark.getLatitudeLandmark() >= -90.0 && landmark.getLatitudeLandmark() <= 90.0) {
            landmarkToSave.setLatitudeLandmark(landmark.getLatitudeLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Latitude");
        }

        // Longitude
        if (landmark.getLongitudeLandmark() >= -180.0 && landmark.getLongitudeLandmark() <= 180.0) {
            landmarkToSave.setLongitudeLandmark(landmark.getLongitudeLandmark());
        } else {
            throw new LandmarkInvalidDataException("add: Landmark Invalid Longitude");
        }

        return landmarkRepo.save(landmarkToSave);
    }

    public Landmark update(Long id, Landmark landmark) throws LandmarkInvalidDataException, LandmarkNotFoundException {
        Landmark landmarkToUpdate;
        if (landmarkRepo.existsById(id)) {
            landmarkToUpdate = landmarkRepo.getById(id);
        } else {
            throw new LandmarkNotFoundException("update: Landmark Not Found");
        }

        // Name
        if (landmark.getNameLandmark() != null && !landmark.getNameLandmark().equals("")) {
            landmarkToUpdate.setNameLandmark(landmark.getNameLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Name");
        }

        // General Description Text
        if (landmark.getGeneralDescriptionTextLandmark() != null && !landmark.getGeneralDescriptionTextLandmark().equals("")) {
            landmarkToUpdate.setGeneralDescriptionTextLandmark(landmark.getGeneralDescriptionTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid General Description");
        }

        // Accessibility Rating Text
        if (landmark.getAccessibilityRatingTextLandmark() != null && !landmark.getAccessibilityRatingTextLandmark().equals("")) {
            landmarkToUpdate.setAccessibilityRatingTextLandmark(landmark.getAccessibilityRatingTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Accessibility Description");
        }

        // Quality Rating Text
        if (landmark.getQualityRatingTextLandmark() != null && !landmark.getQualityRatingTextLandmark().equals("")) {
            landmarkToUpdate.setQualityRatingTextLandmark(landmark.getQualityRatingTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Quality Description");
        }

        // Trust Rating Text
        if (landmark.getTrustRatingTextLandmark() != null && !landmark.getTrustRatingTextLandmark().equals("")) {
            landmarkToUpdate.setTrustRatingTextLandmark(landmark.getTrustRatingTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Trust Description");
        }

        // Popularity Rating Text
        if (landmark.getPopularityRatingTextLandmark() != null && !landmark.getPopularityRatingTextLandmark().equals("")) {
            landmarkToUpdate.setPopularityRatingTextLandmark(landmark.getPopularityRatingTextLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Popularity Description");
        }

        // Accessibility Star Rating
        if (landmark.getStarRatingAccessibilityLandmark() > 0 && landmark.getStarRatingAccessibilityLandmark() <= 5.0) {
            landmarkToUpdate.setStarRatingAccessibilityLandmark(landmark.getStarRatingAccessibilityLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Star Rating Accessibility");
        }

        // Quality Star Rating
        if (landmark.getStarRatingQualityLandmark() > 0 && landmark.getStarRatingQualityLandmark() <= 5.0) {
            landmarkToUpdate.setStarRatingQualityLandmark(landmark.getStarRatingQualityLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Star Rating Quality");
        }

        // Trust Star Rating
        if (landmark.getStarRatingTrustLandmark() > 0 && landmark.getStarRatingTrustLandmark() <= 5.0) {
            landmarkToUpdate.setStarRatingTrustLandmark(landmark.getStarRatingTrustLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Star Rating Trust");
        }

        // Popularity Star Rating
        if (landmark.getStarRatingPopularityLandmark() > 0 && landmark.getStarRatingPopularityLandmark() <= 5.0) {
            landmarkToUpdate.setStarRatingPopularityLandmark(landmark.getStarRatingPopularityLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Star Rating Popularity");
        }

        // Latitude
        if (landmark.getLatitudeLandmark() >= -90.0 && landmark.getLatitudeLandmark() <= 90.0) {
            landmarkToUpdate.setLatitudeLandmark(landmark.getLatitudeLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Latitude");
        }

        // Longitude
        if (landmark.getLongitudeLandmark() >= -180.0 && landmark.getLongitudeLandmark() <= 180.0) {
            landmarkToUpdate.setLongitudeLandmark(landmark.getLongitudeLandmark());
        } else {
            throw new LandmarkInvalidDataException("update: Landmark Invalid Longitude");
        }

        return landmarkRepo.save(landmarkToUpdate);
    }

    public void delete(Long id) throws LandmarkNotFoundException {
        if (landmarkRepo.existsById(id)) {
            landmarkRepo.deleteById(id);
        } else {
            throw new LandmarkNotFoundException("delete: Landmark Not Found");
        }
    }
}
