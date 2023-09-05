package task1;

public class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public char getGender() { return this.gender; }
    public String toString() { return "Author: " + this.name
            + ", gender: " + this.gender + ", email: " + this.email; }
}
