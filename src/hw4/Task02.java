package hw4;

public class Task02 {
    public static void main(String[] args) {
        int count = 0;
        String str = new String("JAVA стоит первым в рейтинге популярности использования языков;" +
                " JAVA один из наиболее мощных высокоуровневых языков программирования; " +
                "JAVA поддерживает большое количество встроенных библиотех, которые позволяют быстро писать проекты любого класса сложности; " +
                "курс «JUNIOR JAVA DEVELOPER» предназначен для подготовки программистов-профессионалов," +
                " специализирующихся на разработке программного обеспечения различного класса и уровня сложности.");

        System.out.println(str.replaceAll("JAVA", "PYTHON"));

        String word = "JAVA";

        String array[] = str.split(" ");

        for (int i = 0; i < array.length; i++) {
            if (word.equals(array[i]))
                count++;
        }
        System.out.println("Слово 'JAVA' встречается в предложение " + count + " раза.");

    }
}