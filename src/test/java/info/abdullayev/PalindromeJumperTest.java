package info.abdullayev;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeJumperTest {

    @Test
    public void whenPalindrom_thenAccept() {
        PalindromeJumper palindromeTester = new PalindromeJumper();
        assertTrue(palindromeTester.isPalindrome("noon"));
      //  assertFalse(palindromeTester.isPalindrome("sdsd"));
      //  assertFalse(palindromeTester.isPalindrome("ddsd"));
    }
}