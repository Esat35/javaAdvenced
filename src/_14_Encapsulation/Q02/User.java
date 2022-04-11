package _14_Encapsulation.Q02;

public class User {
    //id, username, password, active (boolean), signedIn (boolean)

    private String id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    public User() {

    }

    public User(String id, String username, String password, boolean active, boolean signedIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }


}
