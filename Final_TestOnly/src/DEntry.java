// Defines a public class named DEntry
public class DEntry {
    // Declare private integer variable entryID
    private int entryID;
    // Declare private string variable title
    private String title;

    // Constructor: Initializes new objects of the class
    public DEntry(int entryID, String title) {
        // Assigns the value of entryID parameter to the entryID variable
        this.entryID = entryID;
        // Assigns the value of title parameter to the title variable
        this.title = title;
    }

    // Getter method: Returns the value of entryID
    public int getEntryID() { return entryID; }
    // Getter method: Returns the value of title
    public String getTitle() { return title; }
    // Setter method: Assigns a new value to the title variable
    public void setTitle(String title) { this.title = title; }
}
