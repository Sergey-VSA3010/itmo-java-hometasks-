package hw2;

public class Task3 {
    public static void main(String[] args) {
       int month = 12;
       if (month >= 3 && month < 6) System.out.println("Весна");
       else if (month >= 6 && month < 9) System.out.println("Лето");
       else if (month >= 9 && month < 12) System.out.println("Осень");
       else if (month == 12 || month >=1 && month <=2 ) System.out.println("Зима");
       else System.out.println("Не верный номер месяца");

    }
}
