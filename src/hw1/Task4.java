package hw1;

public class Task4 {
    public static void main(String[] args) {
        // x-двузначное целое чило
        // z-коэффициент
        // m-сумма цифр числа х
        // n-вторая цифра
        // k-первая цифра
        int x,z,m,n,k;
        x=46;
        z=10;
        n=x%z;
        k=x/z;

        m=n+k;
        System.out.println(m);
    }
}
