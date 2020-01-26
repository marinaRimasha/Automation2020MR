package com.hyperskill;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ComplexityTests
{
    @Test
    public void testSeveralVowelsInRow()
    {
        double complexity = WordComplexity.getWordComplexity("aaā"); // Seems it takes any vowel as syllable counter
        assertEquals( 0, complexity, 0.001 );
    }

    @Test
    public void testSeveralVowelsInSyllable()
    {
        double complexity = WordComplexity.getWordComplexity("piemērs"); // Seems it takes any vowel as syllable counter
        assertEquals( 2, complexity, 0.001 );
    }

    @Test
    public void testEmptyString()
    {
        double complexity = WordComplexity.getWordComplexity(" ");
        assertEquals( 0, complexity, 0.001 );
    }

    @Test
    public void testSyllableNoRLetter()
    {
        double complexity = WordComplexity.getWordComplexity("putns");
        assertEquals( 0.5, complexity, 0.001 );
    }

    @Test
    public void testLetterR()
    {
        double complexity = WordComplexity.getWordComplexity("r");
        assertEquals( 1, complexity, 0.001 );
    }

    @Test
    public void testCapitalR()
    {
        double complexity = WordComplexity.getWordComplexity("R");
        assertEquals( 1, complexity, 0.001 );
    }

    @Test
    public void testDifferentCaseR()
    {
        double complexity = WordComplexity.getWordComplexity("doktoRatūra");
        assertEquals( 4.5, complexity, 0.001 );
    }


    @Test
    public void test5RLetters()
    {
        double complexity = WordComplexity.getWordComplexity("rrrrr");
        assertEquals( 5, complexity, 0.001 );
    }

    @Test
    public void testWordWithNumbers()
    {
        double complexity = WordComplexity.getWordComplexity("r5t6r5");
        assertEquals( 2, complexity, 0.001 );
    }

    @Test
    public void testNoLetters()
    {
        double complexity = WordComplexity.getWordComplexity("1234567");
        assertEquals( 0, complexity, 0.001 );
    }

    @Test
    public void testWithSpaces()
    {
        double complexity = WordComplexity.getWordComplexity("te nav ko darīt");
        assertEquals( 3.5, complexity, 0.001 );
    }

    @Test
    public void testWithcoma()
    {
        double complexity = WordComplexity.getWordComplexity("ABC,");
        assertEquals( 3.5, complexity, 0.001 );
    }

    @Test
    public void testWithnovowels()
    {
        double complexity = WordComplexity.getWordComplexity("Bbbbbb");
        assertEquals( 0, complexity, 0.001 );
    }

}
