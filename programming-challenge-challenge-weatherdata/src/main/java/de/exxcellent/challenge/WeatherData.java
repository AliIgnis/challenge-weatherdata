package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WeatherData {

    public static final int positionOfMinTemperatureInCsv = 2;
    public static final int positionOfMaxTemperatureInCsv = 1;
    public static final int positionOfDayInCsv = 0;
    private ArrayList<dayTemperature> temperaturesOfEachDay = new ArrayList<>();

    WeatherData(String filePath) {

        try (Scanner scanner = new Scanner(new File(filePath));) {
            boolean readFirstLine = false;
            while (scanner.hasNextLine()) {
                if (readFirstLine) {
                    temperaturesOfEachDay.add(csvLineToDayTemperature(scanner.nextLine()));
                } else {
                    scanner.nextLine();
                    readFirstLine = true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private dayTemperature csvLineToDayTemperature(String line){
        String fields[] = line.split(",");
        return new dayTemperature(Integer.parseInt(fields[positionOfDayInCsv]), Double.parseDouble(fields[positionOfMaxTemperatureInCsv]), Double.parseDouble(fields[positionOfMinTemperatureInCsv]));
    }

    public void findSmallestSpread () {

        if (temperaturesOfEachDay.size() > 0 ) {
            dayTemperature dayWithLowestSpread = temperaturesOfEachDay.get(0);
            for(int dayIndex = 1; dayIndex < temperaturesOfEachDay.size(); dayIndex++){
                dayTemperature dayToCompare = temperaturesOfEachDay.get(dayIndex);
                if (dayWithLowestSpread.temperatureSpread() > dayToCompare.temperatureSpread()) {
                    dayWithLowestSpread = dayToCompare;
                }
            }
            System.out.printf("Day with smallest temperature spread : %s%n", dayWithLowestSpread.getDay());
        } else {
            System.out.println("There is none temperature data");
        }

    }

}
