import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class marsroverTest {

    @Test
    public void should_initialize_mars_rover() {
        MarsRover rover = new MarsRover(0, 0, 'N');
        String report = rover.showStatus();
        assertEquals("0:0:N", report);
    }
}
