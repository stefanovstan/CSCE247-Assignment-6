/**
 * Author: Stanislav Stefanov
 * Purpose of Class: Inherits Command class then specializes it for the Spell Command
 */
public class SpellCommand implements Command {
    private Document spellDoc;

    /**
     * Creates the SpellCommand object and initializes spellDoc
     *
     * @param: Document
     * @return: None
     */
    public SpellCommand(Document doc) {
        spellDoc = doc;
    }

    /**
     * Executes what the SpellCommand is supposed to do
     *
     * @param: None
     * @return: None
     */
    @Override
    public void execute() {
        System.out.println("document " + spellDoc.docName + " is being checked for spelling errors");
    }
}
