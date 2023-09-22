// class
public class User {
    // declares a private variable userID
    private int userID;
    // Ddclares a private string variable username
    private String username;

    // the constructor: initiates new objects of the class
    public User(int userID, String username) {
        // assigns the value of userID parameter to the userID variable
        this.userID = userID;
        // assigns the value of username parameter to the username variable
        this.username = username;
    }

    // the getter method: returns the value of userID
    public int getUserID() { return userID; }
    // the getter method: returns the value of username
    public String getUsername() { return username; }
}
