package de.exxcellent.challenge;

public class dayTemperature {
    private double min = 0;
    private double max = 0;
    private int day = 0;

    dayTemperature(int day, double min, double max) {
        this.day = day;
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double temperatureSpread() {
        return max - min;
    }

}
