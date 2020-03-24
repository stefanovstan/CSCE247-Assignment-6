/**
 * Author: Stanislav Stefanov
 * Purpose of Class: Inherits Command class then specializes it for the Load Command
 */
public class LoadCommand implements Command {
    private Document loadDoc;

    /**
     * Creates the LoadCommand object and initializes loadDoc
     *
     * @param: Document
     * @return: None
     */
    public LoadCommand(Document doc) {
        loadDoc = doc;
    }

    /**
     * Executes what the LoadCommand is supposed to do
     *
     * @param: None
     * @return: None
     */
    @Override
    public void execute() {
        System.out.println("document " + loadDoc.docName + " is loaded into view");
    }
}
