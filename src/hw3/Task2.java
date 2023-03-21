package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите целое число");
        int number = in.nextInt();

        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        System.out.println(sum);
    }
}

