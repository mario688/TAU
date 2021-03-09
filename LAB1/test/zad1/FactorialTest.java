package zad1;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class FactorialTest {
    private Factorial factorial;

    @Before
    public void setUp(){
        factorial = new Factorial();
        System.out.println("Before");
    }
    @After
    public void tearDown(){
        factorial = null;
        System.out.println("After");
    }
    @Test
    public void testFactorialCheckingIsNull(){
        int result = factorial.factorialMethod(4);
        assertNotNull(result);
        System.out.println("Test1");
    }
    @Test
    public void testFactorialInArray(){
        ArrayList<Integer> expected = factorial.factorialMethodInArray(8);
        ArrayList<Integer> actual = new ArrayList<>(Arrays.asList(1, 2, 6, 24, 120, 720, 5040, 40320));
        assertEquals(expected,actual);
        System.out.println("Test2");
    }
    @Test
    public void testFactorialNotEqual(){
        int result = factorial.factorialMethod(5);
        assertNotEquals(12013,result);
        System.out.println("Test3");
    }
    @Test
    public void evenNumberTest(){
        boolean result = factorial.evenNumber(334);
        assertTrue(result);
        System.out.println("Test4");
    }
    @Test
    public void evenNumberTestNotTrue(){
        boolean result = factorial.evenNumber(912321);
        assertFalse(result);
        System.out.println("Test5");
    }
    @Test
    public void testFactorialWhenNumberIsNegative (){
        int result = factorial.factorialMethod(-31235);
        assertEquals(0,result);
        System.out.println("Test6");
    }
    @Test
    public void testFactorial(){
        int result = factorial.factorialMethod(5);
        assertEquals(120,result);
        System.out.println("Test7");
    }
    @Test
    public void testFactorial1(){
        int result = factorial.factorialMethod(10);
        assertEquals(3628800,result);
        System.out.println("Test8");
    }
    @Test
    public void testFactorial2(){
        int result = factorial.factorialMethod(0);
        assertEquals(1,result);
        System.out.println("Test9");
    }
    @Test
    public void test(){
        boolean result = factorial.evenNumber(0);
        assertTrue(result);
        System.out.println("Test10");
    }






}
