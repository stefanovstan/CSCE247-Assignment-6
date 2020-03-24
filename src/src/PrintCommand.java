/**
 * Author: Tom Grogan
 * Purpose of Class: Inherits Command class then customizes the output specific for the Print Command.
 */
public class PrintCommand implements Command {
    private Document printDoc;
    /**
     * Creates the PrintCommand object and initializes printDoc
     *
     * @param: Document
     * @return: None
     */
    public PrintCommand(Document doc) {
        printDoc = doc;
    }

    /**
     * Executes the Print Command.
     *
     * @param: None
     * @return: None
     */
    @Override
    public void execute() {
        System.out.println("document " + printDoc.docName + " is printing...");
    }
}
