package hw5;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        //input = input.strip();
        //input = input.substring(0, 1).toUpperCase() + input.substring(1);

        //String exit = "exit";
        //exit = exit.strip();
        String input01 = input.trim().substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println(input01);
        while (!(scan.nextLine()).equals("exit"))

            System.out.println(input01);


    }
}
