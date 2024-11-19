public class MarsRover {
    private int x;
    private int y;
    private char direction;

    public MarsRover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    public String showStatus() {
        return x + ":" + y + ":" + direction;
    }
}
