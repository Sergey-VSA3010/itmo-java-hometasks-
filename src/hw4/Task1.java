package hw4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите длинну массива");
        Scanner y = new Scanner(System.in);
        int n = y.nextInt();

        int[] ints01 = new int[n];
        double sum = 0;
        int max = ints01[0];

        for (int i = 0; i < ints01.length; i++) {
            int x = (int) (Math.random() * 30);
            ints01[i] = x;
            sum += ints01[i];

            System.out.print(ints01[i] + " ");
        }
        int min = ints01[0];
        for (int i = 0; i < ints01.length; i++){

            if (ints01[i] > max)
                max = ints01[i];

             if (ints01[i] < min)
                min = ints01[i];
        }

        System.out.println("Макс. значение " + max);
        System.out.println("Мин. значение " + min);
        System.out.println("Среднее арифм. " + sum / n);

    }
}