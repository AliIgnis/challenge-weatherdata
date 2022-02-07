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

        String dayWithSmallestTempSpread = "Someday";     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);


        String weatherDataFilePath = "/Users/muhammodalimahmood/Downloads/programming-challenge-challenge-weatherdata/src/main/resources/de/exxcellent/challenge/weather.csv";
        String fotballDataFilePath = "/Users/muhammodalimahmood/Downloads/programming-challenge-challenge-weatherdata/src/main/resources/de/exxcellent/challenge/football.csv";
        WeatherData weaterData = new WeatherData(weatherDataFilePath);
        weaterData.findSmallestSpread();

        footballData footballData = new footballData(fotballDataFilePath);
        footballData.findSmallestSpread();
        /*
        Weather
        In weather.csv you’ll find the daily weather data of a single month. Read the file, then output the day number
        (column one Day) of the day with the smallest temperature spread (difference between maximum & minimum temperature of the day.)
        The maximum temperature is the second column MxT, the minimum temperature the third column MnT.
        */

        /*
        The football.csv file contains results of the English Premier League. The columns labeled ‘Goals’ and ‘Goals Allowed’
        contain the total number of goals scored by and against each team (so Arsenal scored 79 goals themselves and had 36 goals
        scored against them). Read the file, then print the name of the team with the smallest distance (absolute difference) between ‘Goals’ and ‘Goals Allowed’.
        */


        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
