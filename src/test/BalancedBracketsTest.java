package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void startAndEndBracketsReturnsTrue() {
       assertTrue(BalancedBrackets.hasBalancedBrackets("[jamie]"));
    }

    @Test
    public void reversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void threeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }



}
