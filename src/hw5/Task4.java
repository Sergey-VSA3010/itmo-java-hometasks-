package hw5;

public class Task4 {
    public static void main(String[] args) {

        String str = "в предложении все слова разной длины ";

        String[] words = str.split(" ");

        String maxWord = " ";

        for (String word : words)

            if (maxWord.length() < word.length())
                maxWord = word;
        System.out.println("Самое длинное слово: " + maxWord);
    }

}
