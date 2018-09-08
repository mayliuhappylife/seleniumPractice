package test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @BeforeTest
      public void shouleTest(){
       System.out.println("564646463");
}
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("testcase0222222222222");
        addd();
    }
    public void add(){
        System.out.println("testcase02");
    }
    public void addd(){
        System.out.println("testcase0222222222222");
    }
    @Test
    public void testDemo(){
        System.out.println("11111111111111");
    }

}
