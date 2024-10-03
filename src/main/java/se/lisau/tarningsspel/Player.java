package se.lisau.tarningsspel;

// Player-klass
public class Player {

    private String userName;            // attribute

    public Player(String userName) {            // constructor to be able to create objects
        this.userName = userName;
    }


    public String getUserName() {           // get-method to be able to get userName
        return userName;
    }

}
