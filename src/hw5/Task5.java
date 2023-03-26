package hw5;

public class Task5 {
    public static void main(String[] args) {

        int[] mass = {-1, 5, 6, -7, 3, 12, -23, 47, -2, -14};

        int count = 0;

        for (int i = 0; i < mass.length; i++)
        {
            if (mass[i] < 0)

                count++;
        }
        int j = 0;

        int[] negativ = new int[count];

        for (int i = 0; i < mass.length; i++)
        {
            if (mass[i] < 0)
            {
                negativ[j] = mass[i];

                System.out.print(negativ[j] + " ");

                j++;
            }
        }
    }
}
