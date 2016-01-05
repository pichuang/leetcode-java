import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Phil Huang (pichuang@cs.nctu.edu.tw) on 2016/1/5.
 */
public class SolutionTest {

    private Solution test;

    @Test
    public void testMoveZeroes() throws Exception {
        test = new Solution();
        Assert.assertArrayEquals(new int[]{}, test.moveZeroes(new int[]{}));
        Assert.assertArrayEquals(new int[]{0}, test.moveZeroes(new int[]{0}));
        Assert.assertArrayEquals(new int[]{1}, test.moveZeroes(new int[]{1}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, test.moveZeroes(new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 0}, test.moveZeroes(new int[]{1, 2, 3, 0}));
        Assert.assertArrayEquals(new int[]{1, 3, 2, 0}, test.moveZeroes(new int[]{1, 3, 0, 2}));
        Assert.assertArrayEquals(new int[]{1, 2, 0, 0}, test.moveZeroes(new int[]{1, 0, 0, 2}));
        Assert.assertArrayEquals(new int[]{1, 0, 0, 0}, test.moveZeroes(new int[]{0, 0, 0, 1}));

    }
}