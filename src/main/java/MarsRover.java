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

    public String showStatus() {
        return x + ":" + y + ":" + direction;
    }
}
