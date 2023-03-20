package hw2;

public class Task6 {
    public static void main(String[] args) {
        int sum = 8700, saleCode = 425;
        switch (saleCode) {
            case 425:
                sum = (int) (sum - sum * 0.3);
                System.out.println(sum + " Сумма с учетом скидки 30%");
                break;
            case 6424:
            case 7012:
                sum = (int) (sum - sum * 0.2);
                System.out.println(sum + " Сумма с учетом скидки 20%");
                break;
            case 7647:
            case 9011:
            case 6612:
                sum = (int) (sum - sum * 0.1);
                System.out.println(sum + " Сумма с учетом скидки 10%");
                break;
            default:
                System.out.println(sum + " Cкидка не предусмотрена");
        }
    }
}
