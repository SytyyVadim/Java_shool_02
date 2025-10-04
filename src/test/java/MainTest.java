import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void TestUmn() {
        Assertions.assertEquals(15, Main.Umn(3,5));
    }
}