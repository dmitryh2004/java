package task7;

public class Book {
    String author;
    String name;
    int year;
    int page_amount;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage_amount() {
        return page_amount;
    }

    public void setPage_amount(int page_amount) {
        this.page_amount = page_amount;
    }

    public Book(String author, String name, int year, int page_amount) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.page_amount = page_amount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", page_amount=" + page_amount +
                '}';
    }
}
