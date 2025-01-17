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

 //   @Test
  //  public void mainTest(){
 //       app = new App();
  //      String[] input = new String[]{"a"};
   //     app.main(input);
  //  }


    /**
     * Rigorous Test :-)
     */
   // @Test
   // public void shouldAnswerWithTrue()
   // {
   //     assertTrue( true );
   // }

    @Test
    public void testNums(){
        app = new App();
        assertEquals(1,app.nums(1,8));
    }

    @Test
    public void testSentence(){
        app = new App();
        assertEquals("b", app.sentence("c","b"));
    }

    @Test
    public void testBlackJack(){
        app = new App();
        assertEquals(15,app.BlackJack(15,10));
        assertEquals(21,app.BlackJack(10,21));
        assertEquals(0,app.BlackJack(25,22));
        assertEquals(5,app.BlackJack(5,-5));
        assertEquals(0,app.BlackJack(-1,-5));
    }

}

