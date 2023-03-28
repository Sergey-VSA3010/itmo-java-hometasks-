package ru.itmo.lessons.lessons6.books;
// не импортирует Author, тк Book и Author находятся в одном пакете
public class Book {//ru.itmo.lessons.lessons6.books.Book
//private - доступ только из текущего класса
    private String title;
    private Author author;
    public Book(){   // инструкции
        System.out.println("Создается книга");
    }
    public Book(String title, Author author){
        this(); // вызов другого конструктора
        setTitle(title);
        setAuthor(author);
    }
    public Book(String title){
        setTitle(title);
    }
    // методы
    // устанавливает значение свойства title
    public void setTitle(String bookTitle) {

        if (bookTitle == null || bookTitle.length() < 3) {
            throw new IllegalArgumentException("title не менее 3 символов");

        }
        title = bookTitle;

    }

    public void setAuthor(Author author) {
        this.author = author;  // this.author св-ва this - ссылка на текущий объект
        if (author == null) {
            throw new IllegalArgumentException("title не менее 3 символов");
        }


        //возвращает значенте св-ва author
    }
    // возвращает значенте св-ва title
    public String getTitle(){
        return title;
    }
    // возвращает значение свойства author
    public Author getAuthor(){
        return author;

    }
}
