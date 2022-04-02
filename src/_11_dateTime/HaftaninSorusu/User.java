package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class User {
    String name;
   int registerDate;

    User(){

    }

    public User(String name, int registerDate) {
        this.name = name;
        this.registerDate = registerDate;
    }
}
