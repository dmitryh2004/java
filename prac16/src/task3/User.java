package task3;

public class User {
    String service, username, password;

    User(String service, String username, String password) {
        this.service = service;
        this.username = username;
        this.password = password;
    }

    boolean check (String service, String username, String password) {
        return (
                    (this.service.equals(service)) &&
                    (this.username.equals(username)) &&
                    (this.password.equals(password))
                );
    }
}
