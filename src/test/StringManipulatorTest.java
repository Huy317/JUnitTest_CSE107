package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringManipulator;

public class StringManipulatorTest {
   StringManipulator stringManipulator = new StringManipulator();

   @Test
   public void testReverse() {
      assertEquals("oaml", stringManipulator.reverse("lmao"));
      assertEquals("olleh", stringManipulator.reverse("hello"));
      assertEquals("aaaoooeeeiii", stringManipulator.reverse("iiieeeoooaaa"));
   }

   @Test
   public void testIsPalindrome() {
      assertEquals(true, stringManipulator.isPalindrome("omo"));
      assertEquals(false, stringManipulator.isPalindrome("ame"));
   }

   @Test
   public void testIsContained() {
      assertEquals(true, stringManipulator.isContained("hello world", "llo"));
      assertEquals(false, stringManipulator.isContained("hello world", "k"));
   }

   @Test
   public void testNumberRemoved() {
      assertEquals("hello", stringManipulator.numberRemoved("1h2e3l4l5o6"));
      assertEquals("hello", stringManipulator.numberRemoved("hello"));
   }

   @Test
   public void testUpperString() {
      assertEquals("EXAMPLE", stringManipulator.upperString("ExAmPLE"));
   }

   @Test
   public void testLowerString() {
      assertEquals("hello world", stringManipulator.lowerString("HELLO WORLD"));
   }

   @Test
   public void testCapitalString() {
      assertEquals("This Is Example", stringManipulator.capitalString("this is example"));
   }

   @Test
   public void testCountVowels() {
      assertEquals(0, stringManipulator.countVowels("mmmmmmm"));
      assertEquals(4, stringManipulator.countVowels("here we go"));
      assertEquals(6, stringManipulator.countVowels("hihihahahehe"));
   }

   @Test
   public void testCountWords() {
      assertEquals(4, stringManipulator.countWords("Hello, how are you?"));
      assertEquals(5, stringManipulator.countWords("crazy? i was crazy once"));
      assertEquals(1, stringManipulator.countWords("hello"));
      assertEquals(0, stringManipulator.countWords("       "));
   }

   @Test
   public void testFindSubstringIndex() {
      assertEquals(0, stringManipulator.findSubstringIndex("java coding", "java"));
      assertEquals(5, stringManipulator.findSubstringIndex("java coding", "coding"));
      assertEquals(-1, stringManipulator.findSubstringIndex("java coding", "aaaaaa"));
   }
   
   @Test
    public void testReverseWords() {
      assertEquals("You Are How World Hello",stringManipulator.reverseWords("Hello World How Are You"));
    } 
   
   @Test(timeout = 1000)
   public void testReverseWithTimeout() {
      assertEquals("oaml", stringManipulator.reverse("lmao"));
      assertEquals("olleh", stringManipulator.reverse("hello"));
      assertEquals("aaaoooeeeiii", stringManipulator.reverse("iiieeeoooaaa"));
   }

   @Test(timeout = 1000)
   public void testIsPalindromeWithTimeout() {
      assertEquals(true, stringManipulator.isPalindrome("omomomomomomomomomomomomomomomomomo"));
      assertEquals(false, stringManipulator.isPalindrome("ame"));
   }

   @Test(timeout = 1000)
   public void testIsContainedWithTimeout() {
      assertEquals(true, stringManipulator.isContained("hello world", "llo"));
      assertEquals(false, stringManipulator.isContained("hello world", "k"));
   }

   @Test(timeout = 1000)
   public void testNumberRemovedWithTimeout() {
      assertEquals("hello", stringManipulator.numberRemoved("1h2e3l4l5o6"));
      assertEquals("hello", stringManipulator.numberRemoved("hello"));
      assertEquals("wysi", stringManipulator.numberRemoved("727wysi727"));
   }

}
