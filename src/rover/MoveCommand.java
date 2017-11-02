package rover;

public class MoveCommand implements Command {

    @Override
    public void execute(MarsRover marsRover) {
        Direction direction = marsRover.getDirection();
        Point point = marsRover.getPoint();
        marsRover.setPoint(point.pointAfter(direction.offset()));
    }

}
