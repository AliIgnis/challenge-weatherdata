package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WeatherData{

    public static final int positionOfMinTemperatureInCsv = 2;
    public static final int positionOfMaxTemperatureInCsv = 1;
    public static final int positionOfDayInCsv = 0;
    private ArrayList<dayTemperature> temperaturesOfEachDay = new ArrayList<>();

    WeatherData(String filePath) {
        fillArrayListWithFromFile(filePath, true);
    }

    private void fillArrayListWithFromFile(String filePath, boolean header) {
        for (String line:readData.fillArrayListWithDataFromFile(filePath, header)) {
            temperaturesOfEachDay.add(csvLineToObject(line));
        };
    }

    private dayTemperature csvLineToObject(String line){
        String fields[] = line.split(",");
        return new dayTemperature(Integer.parseInt(fields[positionOfDayInCsv]), Double.parseDouble(fields[positionOfMaxTemperatureInCsv]), Double.parseDouble(fields[positionOfMinTemperatureInCsv]));
    }

    public void findSmallestSpread () {
        if (temperaturesOfEachDay.size() > 0 ) {
            int lowestSpreadIndex = 0;
            for(int index = 1; index < temperaturesOfEachDay.size(); index++){
                dayTemperature teamToCompare = temperaturesOfEachDay.get(index);
                if (temperaturesOfEachDay.get(lowestSpreadIndex).calcSpread() > teamToCompare.calcSpread()) {
                    lowestSpreadIndex = index;
                }
            }
            System.out.printf("Day with smallest temperature spread : %s%n", temperaturesOfEachDay.get(lowestSpreadIndex).getDay());
        } else {
            System.out.println("There is none temperature data");
        }
    }

}
