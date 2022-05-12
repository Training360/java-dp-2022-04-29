package command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CommandHandler {

    private Deque<RobotCommand> commands = new ArrayDeque<>();

    private Robot robot = new Robot();

    public void apply(RobotCommand command) {
        commands.push(command);
        command.apply(robot);
    }

    public void undo() {
        var command = commands.pop();
        command.undo(robot);
    }

    public Robot getRobot() {
        return robot;
    }
}
