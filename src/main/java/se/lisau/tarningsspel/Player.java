package se.lisau.tarningsspel;

// Player-klass
public class Player {

    private String userName;            // attribute

    public Player(String userName) {            // constructor
        this.userName = userName;
    }


    public String getUserName() {           // get-method to be able to get username
        return userName;
    }

}
