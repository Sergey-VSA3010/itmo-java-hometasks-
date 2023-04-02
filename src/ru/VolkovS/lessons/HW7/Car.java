package ru.VolkovS.lessons.lesson6.HW7;

public class Car extends Transport{
    public Car(int wearLevel, int number, String color) {
        super(wearLevel, number, color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

}
