package com.isobar.project.exceptions;

public class BandNotFoundException extends RuntimeException {

    public BandNotFoundException(String id) {
        super("Could not find Band " + id);
    }
}