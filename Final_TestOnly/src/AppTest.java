// Declare a public class named AppTest
public class AppTest {

    // The main method is the entry point of any Java application
    public static void main(String[] args) {

        // Create a new object of the DEntry class, with an ID of 1 and a title of "Title1"
        DEntry dEntry = new DEntry(1, "Title1");

        // Create a new object of the User class, with an ID of 1 and a username of "JohnDoe"
        User user = new User(1, "JohnDoe");

        // Create a new object of the TextFileHandler class, with the path set to "path/to/file"
        TextFileHandler handler = new TextFileHandler("path/to/file");

        // Assert that the ID of the dEntry object is 1. If not, an AssertionError is thrown with the message "Error in DEntry"
        assert dEntry.getEntryID() == 1 : "Error in DEntry";

        // Assert that the title of the dEntry object is "Title1". If not, an AssertionError is thrown with the message "Error in DEntry"
        assert "Title1".equals(dEntry.getTitle()) : "Error in DEntry";

        // Assert that the ID of the user object is 1. If not, an AssertionError is thrown with the message "Error in User"
        assert user.getUserID() == 1 : "Error in User";

        // Assert that the username of the user object is "JohnDoe". If not, an AssertionError is thrown with the message "Error in User"
        assert "JohnDoe".equals(user.getUsername()) : "Error in User";

        // Assert that the filePath of the handler object is "path/to/file". If not, an AssertionError is thrown with the message "Error in TextFileHandler"
        assert "path/to/file".equals(handler.getFilePath()) : "Error in TextFileHandler";

        // If all assertions pass, print "All tests passed!" to the console
        System.out.println("All tests passed!");
    }
}
