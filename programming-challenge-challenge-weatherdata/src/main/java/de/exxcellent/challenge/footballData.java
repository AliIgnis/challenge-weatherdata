package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class footballData extends readData{

    public static final int positionOfGoalsAllowed = 6;
    public static final int positionOfGoals = 5;
    public static final int positionOfNameInCsv = 0;
    private ArrayList<fotballTeam> dataOfEachFootballTeam = new ArrayList<>();

    footballData(String filePath) {
        fillArrayListWithFromFile(filePath, true);
    }

    private void fillArrayListWithFromFile(String filePath, boolean header) {
        for (String line:readData.fillArrayListWithDataFromFile(filePath, header)) {
            dataOfEachFootballTeam.add(csvLineToObject(line));
        };
    }

    private fotballTeam csvLineToObject(String line){
        String fields[] = line.split(",");
        return new fotballTeam(fields[positionOfNameInCsv], Integer.parseInt(fields[positionOfGoalsAllowed]), Integer.parseInt(fields[positionOfGoals]));
    }

    public void findSmallestSpread () {

        if (dataOfEachFootballTeam.size() > 0 ) {
            int lowestSpreadIndex = 0;
            for(int index = 1; index < dataOfEachFootballTeam.size(); index++){
                fotballTeam teamToCompare = dataOfEachFootballTeam.get(index);
                if (dataOfEachFootballTeam.get(lowestSpreadIndex).calcSpread() > teamToCompare.calcSpread()) {
                    lowestSpreadIndex = index;
                }
            }
            System.out.printf("Team with smallest goal spread       : %s%n", dataOfEachFootballTeam.get(lowestSpreadIndex).getTeamName());
        } else {
            System.out.println("There is no fotball team data");
        }
    }

}
