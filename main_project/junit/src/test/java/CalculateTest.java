import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by balin.k.v on 19.11.2014.
 */
public class CalculateTest {

    @Test
    public void testCalA() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(2, 2);
        assertEquals(4, n);
    }
}
