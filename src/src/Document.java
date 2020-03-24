/**
 * Author: Stanislav Stefanov
 * Purpose of Class: Object class of Document used in other command classes
 */
public class Document {
    String docName;

    public Document(String name) {
        docName = name;
        System.out.println("Document named " + name + " is created");
    }

    /**
     * Creates new object of the load command then executes the command
     *
     * @param: None
     * @return: None
     */
    public void load() {
        LoadCommand l = new LoadCommand(new Document(docName));
        l.execute();
    }

    /**
     * Creates new object of the spell command then executes the command
     *
     * @param: None
     * @return: None
     */
    public void spell() {
        SpellCommand sc = new SpellCommand(new Document(docName));
        sc.execute();
    }

    /**
     * Creates new object of the save command then executes the command
     *
     * @param: None
     * @return: None
     */
    public void save() {
        SaveCommand s = new SaveCommand(new Document(docName));
        s.execute();
    }

    /**
     * Creates new object of the print command then executes the command
     *
     * @param: None
     * @return: None
     */
    public void print() {
        PrintCommand p = new PrintCommand(new Document(docName));
        p.execute();
    }
}
