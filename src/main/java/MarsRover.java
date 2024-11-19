public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {

            switch(command) {
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
                case 'M':
                    moveforward();
                    break;
            }

        }
    }

    private void turnLeft() {
        switch (direction) {
            case Direction.N:
                direction = Direction.W;
                break;
            case Direction.S:
                direction = Direction.E;
                break;
            case Direction.W:
                direction = Direction.S;
                break;
            case Direction.E:
                direction = Direction.N;

        }

    }

    private void turnRight() {
        switch (direction) {
            case Direction.N:
                direction = Direction.E;
                break;
            case Direction.W:
                direction = Direction.N;
                break;
            case Direction.S:
                direction = Direction.W;
                break;
            case Direction.E:
                direction = Direction.S;
                break;
        }
    }

    public void moveforward() {

        switch (direction) {
            case Direction.N:
                y++;
                break;
            case Direction.S:
                y--;
                break;
            case Direction.W:
                x--;
                break;
            case Direction.E:
                x++;
                break;
        }
    }

    public String showStatus() {
        return x + ":" + y + ":" + direction;
    }
}
