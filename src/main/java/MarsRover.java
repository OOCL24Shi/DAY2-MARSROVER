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


    public String showStatus() {
        return x + ":" + y + ":" + direction;
    }
}
