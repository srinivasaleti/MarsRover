package rover;

public class RightCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setDirection(marsRover.getDirection().rightDirection());
    }
}
