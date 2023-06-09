package hw4;

public class Task1 {
    /*
    * Ответьте на следующие вопросы:

         1. Что означает инициализация переменной?

            Присваивание переменной первоначального значения.

         2. Из каких символов может состоять имя переменной?

            Может состоять из строчных и заглавных латинских букв, цифр,
            а также символов «$» и «_». Имя переменной может начинаться с любого
            из перечисленных символов, кроме цифры.Символ доллара «$», по соглашению,
            никогда не используется.Пробелы при именовании переменных не допускаются.

         3. Будет ли ошибкой использование кириллических символов в именах переменных?

            Нет.Но влияет на его читаемость.

         4. Какие примитивные типы есть в Java?

            byte (целые числа, 1 байт, [-128, 127])
            short (целые числа, 2 байта, [-32768, 32767])
            int (целые числа, 4 байта, [-2147483648, 2147483647])
            long (целые числа, 8 байт)
            float (вещественные числа, 4 байта)
            double (вещественные числа, 8 байт)
            char (символ Unicode, 2 байта, [0, 65536])
            boolean (значение истина/ложь, 4 байта/1 байт в массивах).

         5. Что такое var?

            var используется в объявлении локальной переменной без явного указания типа.

         6. Сколько байт занимает в памяти переменная типа long?

            8 байт.

         7. Что такое явное приведение типов?

            Это указание конкретного типа к которому мы хотим привести значение.

         8. Какой тип данных мы получим в результате сложения short и byte?

            int

         9. Какой тип данных мы получим в результате сложения long и float?

            Eсли в выражении участвует float — то результат приводится к float.

         10. Как работает оператор && ?

             && - логический оператор.Возвращает значение типа Boolean.
             (a&&b) вернёт true,если a и b -true(если a - false,b - не вычисляется).

         11. Что такое тело цикла?

             Тело цикла — последовательность инструкций, предназначенная для многократного исполнения.

         12. Что такое итерация цикла?

             Итерация — единичное выполнение инструкций тела цикла.

         13. Каким образом можно прервать выполнение цикла?

             break; — выход из цикла (не затрагивает внешний цикл).
             continue; — заканчивает выполнение кода в этом теле цикла. Переход к следующей итерации.

         14. Как будет работать следующее ветвление, если значение переменной равно 18 и если значение переменной равно 14?
             if (age >= 18) System.out.println("Вы можете просматривать товары и совершать покупки");
             else if (age < 18) System.out.println("Вы можете просматривать товары, но не совершать покупки");

             18 - "Вы можете просматривать товары и совершать покупки"
             14 - "Вы можете просматривать товары, но не совершать покупки"

         15. Для чего программам нужен метод main?

             Метод main является входной точкой в программу ,который определен в классе Program.
             Именно с него начинается выполнение программы. Он обязательно должен присутствовать в программе.
             При этом его заголовок может быть только таким:  public static void main (String args []).
             *
             * 16. какой тип данных переменной z?

      var x = 100;
      var y = 7l;
      var z = x + y;

      Long.Если в выражении участвует тип long — то именно к этому типу будет приведён результат.

     17. какой тип данных переменной in01?

         var in01 = new Scanner(System.in);

         В зависимости от выбранного метода Next():
         next(): получает введенную строку до первого пробела
         nextLine():строку
         nextInt():  число int
         nextDouble():  число double
         nextBoolean():значение boolean
         nextByte(): число byte (число от -128 до 127)
         nextFloat(): число float
         nextShort():число short (число от -32768 до 32767)

     18. в чём причина ошибки? исправьте её

         var code;
         code = 1;

         var code = 1;

     19. найти и исправить ошибки

        String login = "qwerty";
        String token = "22ffr";
        if (login == "qwerty" && token == "22ffr") {
            System.out.println("Токен и логин указаны верно, Вы вошли в систему");

     20. найти и исправить ошибки

         && заменить на ||

     21.  найти и исправить ошибки

          После выполнения Case должен быть break.


     22.  найти и исправить ошибку в решении задачи:
          напечатать числа от 100 до 0, включая 100 и 0

          int start = 100;
          while (start >= 0) {
            System.out.println(start);
            --start    }

     23. сколько раз будут выполнены инструкции из тела цикла?

         Ни разу. Если оператор сравнения ">" поменять на "<",то 14 раз.

     24. 1. к какому блоку цикла for перейдет программа, когда значение переменной i будет равно 15,
         к проверке условия или обновлению счётчиков?
         2. Сколько раз произойдёт инициализация переменной i?

         1. Обратно в цикл,не выводя 15 на экран. Обновляя счётчик.
         2. Только один раз.
    *  */
}
