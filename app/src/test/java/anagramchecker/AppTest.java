package anagramchecker;

import static anagramchecker.App.isAnagram;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void testSimpleAnagram() {
    assertTrue(isAnagram("simpleAnagram1.txt", "simpleAnagram2.txt"));
  }

  @Test
  void testDiffCasesAnagram() {
    assertTrue(isAnagram("diffCasesAnagram1.txt", "diffCasesAnagram2.txt"));
  }

  @Test
  void testExtraSpaceAnagram() {
    assertTrue(isAnagram("extraSpaceAnagram1.txt", "extraSpaceAnagram2.txt"));
  }

  @Test
  void testUmlautAnagram() {
    assertTrue(isAnagram("umlautAnagram1.txt", "umlautAnagram2.txt"));
  }

  @Test
  void testEmptyAnagram() {
    assertTrue(isAnagram("emptyAnagram1.txt", "emptyAnagram2.txt"));
  }

  @Test
  void testLongAnagram() {
    assertTrue(isAnagram("longAnagram1.txt", "longAnagram2.txt"));
  }

  @Test
  void testNotAnagram() {
    assertFalse(isAnagram("notAnagram1.txt", "notAnagram2.txt"));
  }
}
