package com.cleanLandAPI.exception;

public class FightException extends RuntimeException{
    public FightException(String message) {
        super("Une erreur à eu lieu lors du fight: " + message);
    }
}
