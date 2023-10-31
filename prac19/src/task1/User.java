package task1;

public class User {
    String fio;
    String inn;

    public User(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
