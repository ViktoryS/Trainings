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
            res = controller.rand(GlobalConstants.MIN_BUNDLE, GlobalConstants.MAX_BUNDLE);
            assertTrue(res >= GlobalConstants.MIN_BUNDLE && res <= GlobalConstants.MAX_BUNDLE);
        }
    }

    @After
    public void destroy(){
        controller = null;
    }
}