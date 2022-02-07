package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class footballData {

    public static final int positionOfGoalsAllowed = 6;
    public static final int positionOfGoals = 5;
    public static final int positionOfDayInCsv = 0;
    private ArrayList<fotballTeam> dataOfEachFootballTeam = new ArrayList<>();

    footballData(String filePath) {

        try (Scanner scanner = new Scanner(new File(filePath));) {
            boolean readFirstLine = false;
            while (scanner.hasNextLine()) {
                if (readFirstLine) {
                    dataOfEachFootballTeam.add(csvLineToDayTemperature(scanner.nextLine()));
                } else {
                    scanner.nextLine();
                    readFirstLine = true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private fotballTeam csvLineToDayTemperature(String line){
        String fields[] = line.split(",");
        return new fotballTeam(fields[positionOfDayInCsv], Integer.parseInt(fields[positionOfGoalsAllowed]), Integer.parseInt(fields[positionOfGoals]));
    }

    public void findSmallestSpread () {
        if (dataOfEachFootballTeam.size() > 0 ) {
            fotballTeam teamWithLowestSpread = dataOfEachFootballTeam.get(0);
            for(int dayIndex = 1; dayIndex < dataOfEachFootballTeam.size(); dayIndex++){
                fotballTeam teamToCompare = dataOfEachFootballTeam.get(dayIndex);
                if (teamWithLowestSpread.goalSpread() > teamToCompare.goalSpread()) {
                    teamWithLowestSpread = teamToCompare;
                }
            }
            System.out.printf("Team with smallest goal spread       : %s%n", teamWithLowestSpread.getTeamName());
        } else {
            System.out.println("There is no fotball team data");
        }

    }

}
