package task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Reader Vasya = new Reader("Иванов Василий Иванович", 123,
                "ИИТ", "01.01.2001", "8(800)555-35-35"),
                Petya = new Reader("Иванов Петр Иванович", 124,
                        "ИИТ", "01.02.2001", "8(905)572-12-12");
        Book book1 = new Book("С++ для чайников", "Неизвестен"),
                book2 = new Book("Java для чайников", "Неизвестен"),
                book3 = new Book("Война и мир - 4 тома в 1", "Лев Толстой"),
                book4 = new Book("Мертвые души - 2 том", "Гоголь Н.В."),
                book5 = new Book("Мастер и Маргарита", "Булгаков М.А."),
                book6 = new Book("Преступление и наказание", "Достоевский М.Ф.");
        ArrayList<Book> takeBooks = new ArrayList<>();
        takeBooks.add(book2);
        takeBooks.add(book4);
        takeBooks.add(book5);
        ArrayList<Book> returnBooks = new ArrayList<>();
        returnBooks.add(book1);
        returnBooks.add(book3);
        returnBooks.add(book6);
        Vasya.takeBook(4);
        Petya.returnBook(5);
        String[] takeBooks_v = {"Капитанская дочка", "Евгений Онегин"};
        String[] returnBooks_v = {"Капитанская дочка", "Евгений Онегин"};
        Vasya.returnBook(returnBooks_v);
        Petya.takeBook(takeBooks_v);
        Vasya.takeBook(takeBooks);
        Petya.returnBook(returnBooks);
    }
}
