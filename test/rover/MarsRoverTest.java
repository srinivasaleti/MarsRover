package rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarsRoverTest {

    private MarsRover rover;

    @BeforeEach
    public void setUp() throws Exception {
        rover = new MarsRover(new Point(1,1), "N");
    }

    @Test
    public void shouldMoveRoverAround() throws Exception {
        assertEquals("1 3 N", rover.run("MM"));
    }

    @Test
    public void shouldTurnRoverRight() throws Exception {
        assertEquals("1 1 W", rover.run("RRR"));
    }

    @Test
    public void shouldTurnRoverLeft() throws Exception {
        assertEquals("1 1 E", rover.run("LLL"));
    }

    @Test
    public void shouldCircleAround() throws Exception {
        assertEquals("1 1 N", rover.run("MRMRMRMR"));
        assertEquals("1 1 N", rover.run("MLMLMLML"));
    }

    @Test
    public void shouldNotAllowInvalidInput() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> {
            rover.run("invalid input");
        });
    }
}
