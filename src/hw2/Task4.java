package hw2;

public class Task4 {
    public static void main(String[] args) {
        int count = 60;
        if(count <= 100 && count >= 90) System.out.println("Отлично!");
        else if(count < 90 && count >= 60)System.out.println("Хорошо!");
        else if(count < 60 && count >= 40) System.out.println("Удовлетворительно!");
        else if(count < 40 && count >= 0) System.out.println("Попробуйте в следующий раз!");
        else System.out.println("Не верная оценка!");

    }
}
