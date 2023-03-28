package ru.itmo.lessons.lessons6;
import ru.itmo.lessons.lessons6.books.Author;
import ru.itmo.lessons.lessons6.books.Book;

public class Application {

        // полное имя класса: имя пакета + имя класса
        //ru.itmo.lessons.lessons6.Application
        public static void main(String[] args) {
            // объект класса Author
            // объект типа Author
            //экземпляр класса Author
         Author author01 = new Author();
         // обращение к свойствам
            author01.name = "Mike";
            author01.surname = "Crowed";
            // создать еще один экземпляр класса Author
            // задать значения свойств name и surname
            // вывести значения свойств name и surname
            // созданного объекта в консоль
            Author author02 = new Author();
            author02.name = "Joe";
            author02.surname = "Jonson";
            System.out.println(author02.name + " " + author02.surname);
            // вызов метода
            author01.printFullName();// void
            String author01FullName = author01.getFullName();//String
            System.out.println(author01FullName);

            Book book01 = new Book();

            book01.setTitle("Java 19");

            book01.setAuthor(author01);
            System.out.println(book01.getTitle());
            System.out.println(author02.getFullName());
            System.out.print(book01.getAuthor().getFullName());
            book01.getAuthor().name = "";
            Book book02 = new Book("Java 13",author02);
            System.out.println(book02.getTitle());
    }
}
