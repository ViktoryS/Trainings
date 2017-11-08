package ua.training;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class TestController {
    private Controller controller;

    @Before
    public void init(){
        controller = new Controller(new Model(), new View());
    }

    @Test
    public void testRand(){
        int res;
        for (int i = 0; i < 10000; i++) {
            res = Utils.rand(GlobalConstants.MIN_BARRIER, GlobalConstants.MAX_BARRIER);
            assertTrue(res >= GlobalConstants.MIN_BARRIER && res <= GlobalConstants.MAX_BARRIER);
        }
    }

    @After
    public void destroy(){
        controller = null;
    }
}