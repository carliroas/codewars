package org.carliroas.cdw.kyu5.simple_pig_latin;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("elloHay orldway !", PigLatin.pigIt("Hello world !"));
        assertEquals("aay", PigLatin.pigIt("a"));
        assertEquals("?", PigLatin.pigIt("?"));
        assertEquals(" ", PigLatin.pigIt(" "));
        assertEquals("igPay atinlay siay oolcay ", PigLatin.pigIt("Pig latin is cool "));
        
    }
}