package com.gabriel.dsa_studies.Execices.ctcichapter01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q02_CheckPermutationTest {

    private static Q02_CheckPermutation checkPermutation;
    private static String anagram = "arara";
    private static String invertedAnagram = "raara";
    private static String gato = "gato";
    private static String Gato = "Gato";
    private static String gatoAndEmptySpace = "gato ";
    private static String emptyString = "";
    private static String numbersAndLetters = "1EuTeAmo0";
    private static String numbersAndLettersInverted ="01uETeomA";


    @BeforeAll
    static void createClass(){
        checkPermutation = new Q02_CheckPermutation();
    }


    @Test
    void checkPermutationSorting() {

        assertTrue(checkPermutation.checkPermutationSorting(anagram,invertedAnagram));
        assertTrue(checkPermutation.checkPermutationSorting(invertedAnagram, anagram));
        assertFalse(checkPermutation.checkPermutationSorting(gato,Gato));
        assertTrue(checkPermutation.checkPermutationSorting(gato,gato));
        assertFalse(checkPermutation.checkPermutationSorting(emptyString,gato));
        assertFalse(checkPermutation.checkPermutationSorting(gato,gatoAndEmptySpace));
        assertTrue(checkPermutation.checkPermutationSorting(numbersAndLetters,numbersAndLettersInverted));


    }

    @Test
    void checkPermutationHashmap() {
        assertTrue(checkPermutation.checkPermutationHashmap(anagram,invertedAnagram));
        assertTrue(checkPermutation.checkPermutationHashmap(invertedAnagram, anagram));
        assertFalse(checkPermutation.checkPermutationHashmap(gato,Gato));
        assertTrue(checkPermutation.checkPermutationHashmap(gato,gato));
        assertFalse(checkPermutation.checkPermutationHashmap(emptyString,gato));
        assertFalse(checkPermutation.checkPermutationHashmap(gato,gatoAndEmptySpace));
        assertTrue(checkPermutation.checkPermutationHashmap(numbersAndLetters,numbersAndLettersInverted));
    }
}