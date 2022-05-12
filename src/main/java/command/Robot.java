package command;

import lombok.Data;

@Data
public class Robot {

    private int x = 0;

    private int y = 0;

    private Direction direction = Direction.RIGHT;
}
