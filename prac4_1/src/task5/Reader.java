package task5;

import java.util.ArrayList;

public class Reader {
    String name;
    int readerTicketNumber;
    String fac;
    String date;
    String phone;

    public void takeBook(int amount)
    {
        System.out.println(name + " взял книги: " + amount + " шт.");
    }

    public void takeBook(String[] books_names)
    {
        String temp = "";
        temp += (name + " взял книги: ");
        for (String name:books_names)
        {
            temp += (name + ", ");
        }
        temp = temp.substring(0, temp.length() - 2);
        System.out.println(temp);
    }


    public void takeBook(ArrayList<Book> books)
    {
        String temp = "";
        temp += (name + " взял книги: ");
        for (Book name:books)
        {
            temp += (name.getName() + ", ");
        }
        temp = temp.substring(0, temp.length() - 2);
        System.out.println(temp);
    }

    public void returnBook(int amount)
    {
        System.out.println(name + " вернул книги: " + amount + " шт.");
    }

    public void returnBook(String[] books_names)
    {
        String temp = "";
        temp += (name + " вернул книги: ");
        for (String name:books_names)
        {
            temp += (name + ", ");
        }
        temp = temp.substring(0, temp.length() - 2);
        System.out.println(temp);
    }


    public void returnBook(ArrayList<Book> books)
    {
        String temp = "";
        temp += (name + " вернул книги: ");
        for (Book name:books)
        {
            temp += (name.getName() + ", ");
        }
        temp = temp.substring(0, temp.length() - 2);
        System.out.println(temp);
    }

    public Reader(String name, int readerTicketNumber, String fac, String date, String phone) {
        this.name = name;
        this.readerTicketNumber = readerTicketNumber;
        this.fac = fac;
        this.date = date;
        this.phone = phone;
    }
}
