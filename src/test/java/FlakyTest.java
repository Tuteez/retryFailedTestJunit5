import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlakyTest {
    @RepeatedTest(2)
    public void failTest() {
        assertTrue(false);
    }
}
