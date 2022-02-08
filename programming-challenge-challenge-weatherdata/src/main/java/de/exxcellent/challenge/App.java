package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …

        String weatherDataFilePath = "/Users/muhammodalimahmood/Downloads/programming-challenge-challenge-weatherdata/src/main/resources/de/exxcellent/challenge/weather.csv";
        String fotballDataFilePath = "/Users/muhammodalimahmood/Downloads/programming-challenge-challenge-weatherdata/src/main/resources/de/exxcellent/challenge/football.csv";
        WeatherData weaterData = new WeatherData(weatherDataFilePath);
        weaterData.findSmallestSpread();

        footballData footballData = new footballData(fotballDataFilePath);
        footballData.findSmallestSpread();

    }
}
