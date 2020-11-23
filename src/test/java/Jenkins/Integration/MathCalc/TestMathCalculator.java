package Jenkins.Integration.MathCalc;

import org.junit.Assert;
import org.junit.Test;

public class TestMathCalculator {
    @Test
    public void testSum() {
        MathCalculator calc=new MathCalculator();

        //Assert.assertEquals(5.00,calc.Sum(2,3));
        Assert.assertTrue(5==calc.Sum(2,3));
    }
}
