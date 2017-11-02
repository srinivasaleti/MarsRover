package rover;

public class MarsRover {

    private Direction direction;
    private Point point;
    private CommandFactory commandFactory;

    public MarsRover(Point point, Direction direction, CommandFactory commandFactory) {
        this.point = point;
        this.direction = direction;
        this.commandFactory = commandFactory;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String run(String input) {
        String[] commands = Parser.convertInputIntoCommands(input);
        for (String command : commands) {
            commandFactory.getCommand(command).execute(this);
        }
        return asString();
    }

    private String asString() {
        return point.toString() + " " + direction.representation();
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
