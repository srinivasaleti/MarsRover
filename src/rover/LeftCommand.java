package rover;

import java.util.Arrays;
import java.util.List;

public class LeftCommand implements Command {
    private static final List<String> DIRECTIONS = Arrays.asList("N", "E", "S", "W");

    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setDirection(DIRECTIONS.get((DIRECTIONS.indexOf(marsRover.getDirection()) + 3) % DIRECTIONS.size()));
    }
}
