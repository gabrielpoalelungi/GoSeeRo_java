package com.goseero.goseero_spring_boot.exceptions;

public class LandmarkInvalidDataException extends Exception {
    public LandmarkInvalidDataException(String message) {
        super(message);
    }

    public LandmarkInvalidDataException() {
    }
}
