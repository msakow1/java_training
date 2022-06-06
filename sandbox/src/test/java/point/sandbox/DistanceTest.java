package point.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class DistanceTest {
    @Test
    public void testDistance() {
      TwoPoints p1p2 = new TwoPoints(1, 1, 3, 1);
      Assert.assertEquals(p1p2.distance(),2.0);
    }
  }
