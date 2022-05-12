package command;

public enum Direction {

    RIGHT {
        @Override
        Direction next() {
            return DOWN;
        }
    }, DOWN {
        @Override
        Direction next() {
            return LEFT;
        }
    }, LEFT {
        @Override
        Direction next() {
            return UP;
        }
    }, UP {
        @Override
        Direction next() {
            return RIGHT;
        }
    };

    abstract Direction next();

}
