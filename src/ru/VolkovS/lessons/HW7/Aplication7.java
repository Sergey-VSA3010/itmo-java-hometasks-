package ru.VolkovS.lessons.lesson6.HW7;

import java.util.Random;

public class Aplication7 {
    public static void main(String[] args) {


        Train train = new Train(3, 123, "Green", 8);
        Car car = new Car(2, 234, "Red");
        Bus bus = new Bus(6, 322, "Yellow", false);

        Remzone remzone = new Remzone();

        // for ( int i = 0; i < 10; i++ ){
        remzone.addTransports(train, 0);
        remzone.addTransports(car, 1);
        remzone.addTransports(bus, 2);
        for (Transport transport : remzone.transports) {

            if (transport == null) continue;

            transport.setColor(remzone.colors[new Random().nextInt(remzone.colors.length)]);
            remzone.fixWearLevel(transport);

            System.out.println(transport.getColor() + " " + transport.wearLevel);
            //System.out.println(transport.wearLevel);
        }
        //train.setColor("red");

        System.out.println(bus.isWifi());

    }
}
