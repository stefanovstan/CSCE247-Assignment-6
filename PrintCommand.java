/**
 * Author: Stanislav Stefanov
 * Purpose of Class: Inherits Command class then specializes it for the Print Command
 */
public class PrintCommand implements Command {
    private Document printDoc;

    public PrintCommand(Document doc) {
        printDoc = doc;
    }

    /**
     * Executes what the PrintCommand is supposed to do
     *
     * @param: None
     * @return: None
     */
    @Override
    public void execute() {
        System.out.println("document " + printDoc.docName + " is printing...");
    }
}
