package DesignPattern.Behavioural.Strategy.GMaps;

import exceptions.InvalidInputException;

import java.util.Scanner;


public class GoogleMaps {
    public static void main(String[] args) throws InvalidInputException {
        String source = "Chennai";
        String destination = "Idukki";
        Mode mode = Mode.WALK;
        new FindPath().findPath(source,destination,mode);
    }
}
