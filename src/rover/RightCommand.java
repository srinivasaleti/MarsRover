package rover;

import java.util.Arrays;
import java.util.List;

public class RightCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setDirection(marsRover.getDirection().rightDirection());
    }
}
