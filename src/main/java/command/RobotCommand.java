package command;

public interface RobotCommand {

    void apply(Robot robot);

    void undo(Robot robot);
}
