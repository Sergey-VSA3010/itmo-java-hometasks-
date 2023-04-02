package ru.VolkovS.lessons.lesson6.HW7;

public class Bus extends Transport{

    private boolean wifi;
    public Bus(int wearLevel, int number, String color, boolean wifi) {
        super(wearLevel, number, color);
        this.wifi = wifi;
    }
    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }





}
