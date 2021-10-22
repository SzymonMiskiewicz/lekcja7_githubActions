import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSum(){
        Main main = new Main();
        assertEquals(11,main.sum(3,8));
    }
}
