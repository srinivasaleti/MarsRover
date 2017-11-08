package rover;

public class CommandFactory {
    Command getCommand(String command) {
        if( "L".equals(command)) {
            return new LeftCommand();
        } else if ("M".equals(command)) {
            return new MoveCommand();
        } else if ("R".equals(command)){
            return  new RightCommand();
        }
        return null;
    }
}
