package com.goseero.goseero_spring_boot.exceptions;

public class LandmarkNotFoundException extends Exception {
    public LandmarkNotFoundException() {
    }

    public LandmarkNotFoundException(String message) {
        super(message);
    }
}
