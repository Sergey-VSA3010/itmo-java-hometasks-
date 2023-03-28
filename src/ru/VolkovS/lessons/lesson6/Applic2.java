package ru.VolkovS.lessons.lesson6;

import ru.VolkovS.lessons.lesson6.Climbers.Climber;
import ru.VolkovS.lessons.lesson6.Climbers.Mountains;

public class Applic2 {
    public static void main(String[] args) {

        Climber climber1 = new Climber("Jonse", "France");
        Climber climber2 = new Climber("Vlad", "Russia");
        Climber climber3 = new Climber("Gans", "Germany");

        Climber[] climbers = {climber1,climber2,climber3};

        Mountains mountain1 = new Mountains("Elbrus", "Russia", 5642);
        Mountains mountain2 = new Mountains("Everest", "Nepal", 8848);
        Mountains mountain3 = new Mountains("Kilimanjaro", "Tanzania", 5895);

        Mountains [] mountains = {mountain1,mountain2,mountain3};

        System.out.println(mountain3.getFullName());
        System.out.println(mountain2.getСountry());
        System.out.println(climber2.getFullName());
        System.out.println(mountain3.getHeight());
        System.out.println(mountain3.getName());
    }
}
