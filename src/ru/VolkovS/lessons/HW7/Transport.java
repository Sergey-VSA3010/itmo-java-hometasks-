package ru.VolkovS.lessons.lesson6.HW7;

public class Transport {
    public   int wearLevel = 0;
    private    int number;

    private String color;

    public Transport(){

    }
    public Transport(int wearLevel, int number, String color) {
        this.wearLevel = wearLevel;
        this.number = number;
        this.color = color;
    }

    public int getWearLevel() {
        return wearLevel;
    }

    public void setWearLevel(int wearLevel) {
        if(wearLevel < 0) {
            throw new IllegalArgumentException("Exception:wearLevel must be > 0");

        }
        this.wearLevel = wearLevel;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
}
