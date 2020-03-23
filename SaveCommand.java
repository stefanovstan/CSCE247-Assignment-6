/**
 * Author: Stanislav Stefanov
 * Purpose of Class: Inherits Command class then specializes it for the Save Command
 */
public class SaveCommand implements Command {
    private Document saveDoc;

    public SaveCommand(Document doc) {
        saveDoc = doc;
    }

    /**
     * Executes what the SaveCommand is supposed to do
     *
     * @param: None
     * @return: None
     */
    @Override
    public void execute() {
        System.out.println("document " + saveDoc.docName + " is being saved...");
    }
}
