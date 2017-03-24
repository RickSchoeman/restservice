package restservice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ricks on 24-3-2017.
 */
public class WindmolenTest {
    double DELTA = 1e-15;
    @Test
    public void geldigeInput() {
    Windmolen w = new Windmolen();
    double result = w.getKwh(11);
    assertEquals(2991.8345025894946, result, DELTA);
    }
}
