package com.quality.desafio.Exceptions;

public class cityDoesNotExist extends RuntimeException{
    public cityDoesNotExist(String city) {
        super("The city " + city + " does not exist.");
    }
}
