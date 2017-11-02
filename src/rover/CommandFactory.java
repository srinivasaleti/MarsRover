package rover;

public class CommandFactory {
    Command getCommand(String command) {
        if(command.equals( "L")) {
            return new LeftCommand();
        } else if (command.equals("M")) {
            return new MoveCommand();
        } else if (command.equals("R")){
            return  new RightCommand();
        }
        return new EmptyCommand();
    }
}
