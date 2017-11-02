package rover;

import java.util.Arrays;
import java.util.List;

public class Parser {

    private static final List<String> VALID_COMMANDS = Arrays.asList("L", "R", "M");

    static String[] convertInputIntoCommands(String input) {
        String[] commandArray = input.split("(?!^)");
        validateCommands(input, commandArray);
        return commandArray;
    }

    private static void validateCommands(String input, String[] commandArray) {
        for (String command : commandArray) {
            if (!VALID_COMMANDS.contains(command)) {
                throw new IllegalArgumentException("Invalid command sequence: " + input);
            }
        }
    }
}
