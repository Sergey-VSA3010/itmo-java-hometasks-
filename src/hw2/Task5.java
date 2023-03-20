package hw2;
public class Task5
{
    public static void main(String[] args) {
        int x = 10+(int)(Math.random()*(490+1));

        System.out.println(x);
        if (x > 25 && x < 200) System.out.println("Число " + x + " содержится в интервале (25;200)");
        else System.out.println("Число " + x +" не содержится в интервале (25;200)");
    }
}