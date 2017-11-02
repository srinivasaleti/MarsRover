package rover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private static final List<String> VALID_COMMANDS = Arrays.asList("L", "R", "M");
    private static final List<String> DIRECTIONS = Arrays.asList("N", "E", "S", "W");

    private static final int Y = 1;
    private static final int X = 0;

    private String direction;
    private Point point;

    public MarsRover(Point point, String direction) {
        this.point = point;
        this.direction = direction;
    }

    public String run(String input) {
        String[] commands = convertInputIntoCommands(input);

        for (String command : commands) {
            if (command.equals("M")) {
                move();
            } else if (command.equals("R")) {
                turnRight();
            } else if (command.equals("L")) {
                turnLeft();
            }
        }

        return asString();
    }

    private void move() {
        if (direction.equals("N")) {
            point = point.update(new Point(0, 1));
        } else if (direction.equals("S")) {
            point = point.update(new Point(0, -1));
        } else if (direction.equals("E")) {
            point = point.update(new Point(1, 0));
        } else if (direction.equals("W")) {
            point = point.update(new Point(-1, 0));
        }
    }

    private String asString() {

        return  point.toString() + " " + direction;
    }

    private void turnLeft() {

        direction = DIRECTIONS.get((DIRECTIONS.indexOf(direction) + 3) % DIRECTIONS.size());
    }

    private void turnRight() {

        direction = DIRECTIONS.get((DIRECTIONS.indexOf(direction) + 1) % DIRECTIONS.size());
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


}
