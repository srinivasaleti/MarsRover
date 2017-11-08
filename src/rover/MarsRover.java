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

    public Point getPoint() {
        return point;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String run(String input) {
        String[] commands = Parser.convertInputIntoCommands(input);
        Command marsRoverCommand;
        for (String command : commands) {
            marsRoverCommand = commandFactory.getCommand(command);
            if(marsRoverCommand != null){
                marsRoverCommand.execute(this);
            }
        }
        return asString();
    }

    private String asString() {
        return point.toString() + " " + direction.representation();
    }

}
