package rover;

import java.util.Arrays;
import java.util.List;

public class LeftCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setDirection(marsRover.getDirection().leftDirection());
    }
}
