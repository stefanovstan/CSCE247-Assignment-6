/**
 * Author: Stanislav Stefanov
 * Purpose of Class: Manages the user input and what command will be used
 */
import java.util.HashMap;

public class InputHandler {

    private HashMap<String, Command> commands;

    public InputHandler(Document document) {
        commands = new HashMap<>();
        commands.put("load", new LoadCommand(document));
        commands.put("save", new SaveCommand(document));
        commands.put("spell", new SpellCommand(document));
        commands.put("print", new PrintCommand(document));

    }

    /**
     * Searches through hashmap for specific command entered by user
     *
     * @param: Data
     * @return: None
     */
    public void inputEntered(String data) {
        if (commands.containsKey(data)) {
            commands.get(data).execute();
        }
        else {
            System.out.println("Sorry, we didn't recognize that command");
        }
    }
}
