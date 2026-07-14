package com.gabriel.dsa_studies.Execices.ctcichapter01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q04_PalindromePermutationTest {


    private static Q04_PalindromePermutation palindromePermutation;
    private static String araraMessedUpString = "raara";
    private static String onibusPalindromeMessedUpString = "onibusemmarrocossocorrosubino";
    private static String fakePalindromeMessedUpString = "jararacacararajadada";





    @BeforeAll
    static void createClass(){
        palindromePermutation = new Q04_PalindromePermutation();
    }





    @Test
    void palindromePermutationWithHashmap() {

        assertTrue(palindromePermutation.palindromePermutationWithHashmap(araraMessedUpString));
        assertTrue(palindromePermutation.palindromePermutationWithHashmap(onibusPalindromeMessedUpString));
        assertFalse(palindromePermutation.palindromePermutationWithHashmap(fakePalindromeMessedUpString));

    }
}