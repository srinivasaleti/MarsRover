package rover;

public class MoveCommand implements Command {

    @Override
    public void execute(MarsRover marsRover) {
        String  direction = marsRover.getDirection().representation();
        Point point = marsRover.getPoint();
        if (direction.equals("N")) {
            marsRover.setPoint(point.update(new Point(0, 1)));
        } else if (direction.equals("S")) {
            marsRover.setPoint(point.update(new Point(0, -1)));
        } else if (direction.equals("E")) {
            marsRover.setPoint(point.update(new Point(1, 0)));
        } else if (direction.equals("W")) {
            marsRover.setPoint(point.update(new Point(-1, 0)));
        }
    }

}
