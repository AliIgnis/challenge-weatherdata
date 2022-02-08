package de.exxcellent.challenge;

import java.util.ArrayList;

public class helperFunction {

    static double calcSpread(double value1, double value2) {
        double spread = value1 - value2;
        return (spread < 0 ? spread * -1 : spread);
    };
}
