package task1;
import java.lang.*;
import java.io.IOException;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String name = "", email = "";
        char gender = 'm';
        System.out.print("Введите имя: ");
        name = sc.nextLine();
        System.out.print("Введите email: ");
        email = sc.nextLine();
        System.out.print("Введите пол: ");
        gender = (char) System.in.read();
        Author author = new Author(name, email, gender);
        System.out.println("Имя автора: " + author.getName());
        System.out.println("email автора: " + author.getEmail());
        System.out.println("Пол автора: " + author.getGender());
        System.out.println(author);
        author.setEmail("dzerzhinskiy_ri@mail.ru");
        System.out.println(author);
    }
}
