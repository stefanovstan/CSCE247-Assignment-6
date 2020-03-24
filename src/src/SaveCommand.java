/**
 * Author: Tom Grogan
 * Purpose of Class: Inherits Command class then customizes the output specific for the Save Command.
 */
public class SaveCommand implements Command {
    private Document saveDoc;

    public SaveCommand(Document doc) {
        saveDoc = doc;
    }

    /**
     * Executes the Save Command
     *
     * @param: None
     * @return: None
     */
    @Override
    public void execute() {
        System.out.println("document " + saveDoc.docName + " is being saved...");
    }
}
