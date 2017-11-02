package rover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private static final List<String> VALID_COMMANDS = Arrays.asList("L", "R", "M");
    private static final List<String> DIRECTIONS = Arrays.asList("N", "E", "S", "W");

    private String direction;
    private Point point;
    private CommandFactory commandFactory;


    public MarsRover(Point point, String direction, CommandFactory commandFactory) {
        this.point = point;
        this.direction = direction;
        this.commandFactory = commandFactory;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String run(String input) {
        String[] commands = convertInputIntoCommands(input);
        for (String command : commands) {
            commandFactory.getCommand(command).execute(this);
        }
        return asString();
    }

    private String asString() {

        return point.toString() + " " + direction;
    }

    private static String[] convertInputIntoCommands(String input) {
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


    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
