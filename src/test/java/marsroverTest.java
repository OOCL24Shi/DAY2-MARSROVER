import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class marsroverTest {

    @Test
    public void should_initialize_mars_rover() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        String report = rover.showStatus();
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_face_west_when_orient_north_and_turn_left() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.executeCommands("L");
        assertEquals("0:0:W", rover.showStatus());
    }

    @Test
    public void should_face_north_when_orient_east_and_turn_left() {
        MarsRover rover = new MarsRover(0, 0,Direction.E);
        rover.executeCommands("L");
        assertEquals("0:0:N", rover.showStatus());
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left() {
        MarsRover rover = new MarsRover(0, 0, Direction.S);
        rover.executeCommands("L");
        assertEquals("0:0:E", rover.showStatus());
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left() {
        MarsRover rover = new MarsRover(0, 0, Direction.W);
        rover.executeCommands("L");
        assertEquals("0:0:S", rover.showStatus());
    }

    //turn right

    @Test
    public void should_face_east_when_orient_north_and_turn_right() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.executeCommands("R");
        assertEquals("0:0:E", rover.showStatus());
    }

    @Test
    public void should_face_south_when_orient_east_and_turn_right() {
        MarsRover rover = new MarsRover(0, 0,Direction.E);
        rover.executeCommands("R");
        assertEquals("0:0:S", rover.showStatus());
    }

    @Test
    public void should_face_west_when_orient_south_and_turn_right() {
        MarsRover rover = new MarsRover(0, 0, Direction.S);
        rover.executeCommands("R");
        assertEquals("0:0:W", rover.showStatus());
    }

    @Test
    public void should_face_north_when_orient_west_and_turn_right() {
        MarsRover rover = new MarsRover(0, 0, Direction.W);
        rover.executeCommands("R");
        assertEquals("0:0:N", rover.showStatus());
    }

}
