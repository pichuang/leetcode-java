import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Test
    public void testAddDigits() throws Exception {
        solution = new Solution();
        Assert.assertEquals(2, solution.addDigits(38));
        Assert.assertEquals(3, solution.addDigits(3));
        Assert.assertEquals(8, solution.addDigits(1853));
    }

}