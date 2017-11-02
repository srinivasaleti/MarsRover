package rover;

public class MoveCommand implements Command {

    @Override
    public void execute(MarsRover marsRover) {
        Direction direction = marsRover.getDirection();
        marsRover.setPoint(marsRover.getPoint().update(direction.offset()));
    }

}
