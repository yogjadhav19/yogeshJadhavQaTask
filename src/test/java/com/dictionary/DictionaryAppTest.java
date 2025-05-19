package com.dictionary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DictionaryAppTest {
    @Test
    public void testPalindrome() {
        Assert.assertTrue(StringUtil.isPalindrome("madam"));
        Assert.assertFalse(StringUtil.isPalindrome("hello"));
    }

    @Test
    public void testAnagram() {
        Assert.assertTrue(StringUtil.isAnagram("listen", "silent"));
        Assert.assertFalse(StringUtil.isAnagram("hello", "world"));
    }

    @Test
    public void testValidWord() {
        Assert.assertTrue(DictionaryChecker.isValidEnglishWord("apple"));
    }

    @Test
    public void testInvalidWord() {
        Assert.assertFalse(DictionaryChecker.isValidEnglishWord("qwertyasdf"));
    }
}
