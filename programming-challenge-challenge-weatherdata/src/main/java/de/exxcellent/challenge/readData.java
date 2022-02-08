package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readData {

    static public ArrayList<String> fillArrayListWithDataFromFile(String filePath, boolean header) {
        ArrayList<String> linesOfFile = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filePath));) {
            boolean readFirstLine = false;
            while (scanner.hasNextLine()) {
                //First line contains header
                if (readFirstLine && header) {
                    linesOfFile.add((scanner.nextLine()));
                } else {
                    scanner.nextLine();
                    readFirstLine = true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return linesOfFile;
    }
}
