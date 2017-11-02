package rover;

public class LeftCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setDirection(marsRover.getDirection().leftDirection());
    }
}
