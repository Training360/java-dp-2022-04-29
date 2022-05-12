package command;

import lombok.Value;

@Value
public class MoveRobotCommand implements RobotCommand {

    private int distance;

    @Override
    public void apply(Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT -> robot.setX(robot.getX() + distance);
            case LEFT -> robot.setX(robot.getX() - distance);
            case UP -> robot.setX(robot.getY() + distance);
            case DOWN -> robot.setX(robot.getY() - distance);
        }

    }

    @Override
    public void undo(Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT -> robot.setX(robot.getX() - distance);
            case LEFT -> robot.setX(robot.getX() + distance);
            case UP -> robot.setX(robot.getY() - distance);
            case DOWN -> robot.setX(robot.getY() + distance);
        }
    }
}
