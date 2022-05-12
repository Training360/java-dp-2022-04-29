package command;

public class TurnRobotCommand implements RobotCommand{

    @Override
    public void apply(Robot robot) {
        robot.setDirection(robot.getDirection().next());
    }

    @Override
    public void undo(Robot robot) {
        //
    }
}
