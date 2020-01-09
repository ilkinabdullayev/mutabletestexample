package info.abdullayev;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void whenPalindrom_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
      //  assertFalse(palindromeTester.isPalindrome("sdsd"));
      //  assertFalse(palindromeTester.isPalindrome("ddsd"));
    }
}