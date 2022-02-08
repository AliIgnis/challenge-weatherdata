package de.exxcellent.challenge;

public class dayTemperature{
    private double min = 0;
    private double max = 0;
    private int day = 0;

    dayTemperature(int day, double min, double max) {
        this.day = day;
        this.min = min;
        this.max = max;
    }

    dayTemperature(String fileLine) {
        init(fileLine);
    }

    void init(String fileLine) {
        String fields[] = fileLine.split(",");
        day = Integer.parseInt(fields[0]);
        min = Double.parseDouble(fields[1]);
        max = Double.parseDouble(fields[2]);
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

    public double calcSpread() {
        return helperFunction.calcSpread(min, max);
    }

}
