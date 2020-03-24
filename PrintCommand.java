/**
 * Author: Tom Grogan
 * Purpose of Class: Inherits Command class then customizes the output specific for the Print Command.
 */
public class PrintCommand implements Command {
    private Document printDoc;

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
