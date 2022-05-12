package command;

public class RobotMain {

    public static void main(String[] args) {
        var handler = new CommandHandler();
        handler.apply(new MoveRobotCommand(10));

        System.out.println(handler.getRobot());

        handler.undo();

        System.out.println(handler.getRobot());
    }
}
