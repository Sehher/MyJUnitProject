package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @Test
    public void mainTest(){
        app = new App();
        String[] input = new String[]{"a"};
        app.main(input);
    }


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testNums(){
        app = new App();
        assertEquals(1,app.nums(1,8));
    }

}

