package task1;

public class UserChecker {
    User[] users = new User[10];

    public UserChecker() {
        users[0] = new User("Иванов А.В.", "1234567890");
        users[1] = new User("Петров П.А.", "0987654321");
        users[2] = new User("Сидоров И.С.", "1029384756");
        users[3] = new User("Смирнов С.И.", "1236547890");
        users[4] = new User("Кузнецов И.В.", "1478963250");
        users[5] = new User("Дзержинский Р.И.", "3336669990");
        users[6] = new User("Иванов В.В.", "0236987451");
        users[7] = new User("Плотников А.Ф.", "2281591696");
        users[8] = new User("Иванов И.И.", "6666655555");
        users[9] = new User("Достоевский Ф.М.", "1800190016");
    }

    public void check(String fio, String inn)
    {
        boolean fioValid = false;
        User userFound = null;
        for (User u: users)
        {
            if (u.getFio().equals(fio)) {
                fioValid = true;
                userFound = u;
                break;
            }
        }
        if (!fioValid)
        {
            throw new BadFIOException("Указанное ФИО не найдено в базе данных: " + fio);
        }
        else {
            if (userFound.getInn().equals(inn))
            {
                System.out.println("Идентификация успешна");
            }
            else {
                throw new InnIsNotValidException("Указанный ИНН недействителен для пользователя " + fio + ": " + inn);
            }
        }
    }
}
