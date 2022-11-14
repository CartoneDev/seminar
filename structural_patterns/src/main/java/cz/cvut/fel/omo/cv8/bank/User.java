package cz.cvut.fel.omo.cv8.bank;

import java.util.Date;
import java.util.List;

public class User {
    private final Date birth;
    private String name;
    private String surname;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;

    private List<Account> disponentAccountList;
    private List<Account> ownedAccountList;

    public User(Date birth, String name, String surname, String userName, String password, String email, String phoneNumber) {
        this.birth = birth;
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
