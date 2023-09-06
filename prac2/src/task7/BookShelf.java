package task7;
import java.util.ArrayList;
import java.util.Collections;

public class BookShelf {
    ArrayList<Book> books;
    int amount;

    public BookShelf() {
        books = new ArrayList<>();
        amount = 0;
    }

    public void addBook(Book newbook)
    {
        books.add(newbook);
        amount++;
    }

    public void removeBook(int index)
    {
        if (index < 0 || index >= amount) return;
        books.remove(index);
        amount--;
    }

    public void removeBook(Book book_to_remove)
    {
        if (books.remove(book_to_remove)) amount--;
    }

    public Book getYoungest()
    {
        if (books.isEmpty()) return null;
        Book res = books.get(0);
        for (int i = 0; i < amount; i++)
        {
            if (books.get(i).year > res.year) res = books.get(i);
        }
        return res;
    }

    public Book getOldest()
    {
        if (books.isEmpty()) return null;
        Book res = books.get(0);
        for (int i = 0; i < amount; i++)
        {
            if (books.get(i).year < res.year) res = books.get(i);
        }
        return res;
    }

    public void sort()
    {
        for (int i = 0; i < amount; i++)
        {
            for (int j = 0; j < amount; j++)
            {
                if (books.get(i).year < books.get(j).year)
                {
                    Collections.swap(books, i, j);
                }
            }
        }
    }

    public String toString() {
        return "BookShelf{" +
                "Имеющиеся книги: " + books +
                ", общее количество - " + amount +
                '}';
    }
}
