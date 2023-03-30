package ru.VolkovS.lessons.lesson6;

import ru.VolkovS.lessons.lesson6.Climbers.Climber;
import ru.VolkovS.lessons.lesson6.Climbers.Mountains;
import ru.VolkovS.lessons.lesson6.Climbers.Group;

public class Applic2 {
    public static void main(String[] args) {

        Climber climber1 = new Climber("Jonse", "France");
        Climber climber2 = new Climber("Vlad", "Russia");
        Climber climber3 = new Climber("Gans", "Germany");

        Climber[] climber = {climber1, climber2, climber3};

        Mountains mountain1 = new Mountains("Kazbek", "Russia", 5033);
        Mountains mountain2 = new Mountains("Everest", "Nepal", 8848);
        Mountains mountain3 = new Mountains("Kilimanjaro", "Tanzania", 5895);

        Mountains[] mountains = {mountain1, mountain2, mountain3};


        Group group1 = new Group(true, mountains[0], 3);
        Group group2 = new Group(true, mountains[1], 2);
        Group group3 = new Group(true, mountains[2], 2);
        Group[] group = {group1,group2,group3};

        //System.out.println(mountain3.getFullName());

      //  System.out.println(climber2.getFullName());
        //System.out.println(mountain3.getHeight());
        //System.out.println(mountain3.getName());

        for (int i = 0; i < 3; i++) {
            group[0].addClimber(climber[0]);

        }

        for (int i = 0; i < 2; i++) {
           group[1].addClimber(climber[1]);
        }
        for (int i = 1; i < 3; i++) {
            group[2].addClimber(climber[2]);
        }
        System.out.println(group1.getfullGroup());
        for(Group groups: group){
            System.out.println(????);
        }
    }


}
