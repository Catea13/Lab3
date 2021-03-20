package com.company;

public class BalaurException extends Exception {
    int intValue;
    float floatValue;

    public BalaurException(int intValue, String measurementValue) {
        System.out.println(measurementValue + " nu poate fi " + intValue);
    }

    public BalaurException(float floatValue, String measurementValue) {
        System.out.println(measurementValue + " nu poate fi " + floatValue);
    }

    void handle(){

    }
}
