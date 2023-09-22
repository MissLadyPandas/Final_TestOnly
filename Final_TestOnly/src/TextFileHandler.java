// Defines a public class named TextFileHandler
public class TextFileHandler {
    // Declare private string variable filePath
    private String filePath;

    // Constructor: Initializes new objects of the class
    public TextFileHandler(String filePath) {
        // Assigns the value of filePath parameter to the filePath variable
        this.filePath = filePath;
    }

    // Getter method: Returns the value of filePath
    public String getFilePath() { return filePath; }
}
