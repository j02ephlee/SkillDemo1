import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void TwoTimesThreeShouldEqualSix() {
        assertEquals(6, SkillDemo.multiply(3, 2));
    }
}
