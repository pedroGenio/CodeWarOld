package codewar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro Elias
 */
public class AreSameTest {

   
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), true);
    }
    
    @Test
    public void test2() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), false);
    }
    
    @Test
    public void test3() {
        int[] a = new int[]{};
        int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), false);
    }
    
    @Test
    public void test4() {
        int[] a = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        int[] b = new int[]{};
        assertEquals(AreSame.comp(a, b), false);
    }
    
    @Test
    public void test5() {
        int[] a = null;
        int[] b = new int[]{};
        assertEquals(AreSame.comp(a, b), false);
    }
    
    @Test
    public void test6() {
        int[] a = new int[]{};
        int[] b = null;
        assertEquals(AreSame.comp(a, b), false);
    }
    
    @Test
    public void test7() {
        int[] a = new int[]{};
        int[] b = new int[]{};
        assertEquals(AreSame.comp(a, b), true);
    }
    
    @Test
    public void test8() {
        int[] a = null;
        int[] b = null;
        assertEquals(AreSame.comp(a, b), false);
    }

}
