package hw5;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Введите слово");
        Scanner scanner = new Scanner(System.in);


        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            while ((scanner.nextLine().equalsIgnoreCase("exit")))
            {
                break;}

            str[i] = scanner.nextLine();

        for (; i < n; i++)

            System.out.println(str[i]);
        }

    }
}
