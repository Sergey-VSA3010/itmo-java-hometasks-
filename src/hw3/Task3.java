package hw3;
import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {

        int x = 5; // x - загаданное число
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число.");
            int y = in.nextInt();// y - число вводимое пользователем
            if (y == 0) {
                System.out.println("Вы ввели 0!");
                break;
            }
            if (y > x) {
                System.out.println("Загаданное число меньше!");
                continue;
            }
            if (y < x) {
                System.out.println("Загаданное число больше!");
                continue;
            } else if (x == y) System.out.print("Вы угадали!");
            break;

        }
    }
}
