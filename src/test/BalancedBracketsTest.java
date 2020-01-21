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

    @Test
    public void multipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void balancedBracketsMidEndWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void balancedBracketsBothMidWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[co]de"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void balancedBracketsWithSpecialCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[!@#]"));
    }

    @Test
    public void stringWithNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Jamie"));
    }

    @Test
    public void multipleReversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }

    @Test
    public void multipleBalancedBracketsOutOfOrderReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }
}
