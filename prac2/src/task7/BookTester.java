package task7;

public class BookTester {
    public static void main(String[] args) {
        BookShelf bs = new BookShelf();
        bs.addBook(new Book("Лев Толстой", "Война и мир - том 1", 1865, 400));
        bs.addBook(new Book("Лев Толстой", "Война и мир - том 4", 1868, 400));
        bs.addBook(new Book("Лев Толстой", "Война и мир - том 3", 1867, 400));
        bs.addBook(new Book("Лев Толстой", "Война и мир - том 2", 1866, 400));
        System.out.println("Самая старая книга на полке: " + bs.getOldest());
        System.out.println("Самая новая книга на полке: " + bs.getYoungest());
        System.out.println("Исходная полка: " + bs);
        bs.sort();
        System.out.println("Отсортированная по дате полка: " + bs);
    }
}
