package rover;

public class MarsRover {

    private String direction;
    private Point point;
    private CommandFactory commandFactory;

    public MarsRover(Point point, String direction, CommandFactory commandFactory) {
        this.point = point;
        this.direction = direction;
        this.commandFactory = commandFactory;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
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
        return point.toString() + " " + direction;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
