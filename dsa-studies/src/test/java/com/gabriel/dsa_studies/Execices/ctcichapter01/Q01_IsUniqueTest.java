package com.gabriel.dsa_studies.Execices.ctcichapter01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q01_IsUniqueTest {

    private static Q01_IsUnique isUnique;
    private static String gato = "gato";
    private static String Ggato = "Ggato";
    private static String palavra = "palavra";
    private static String emptyString = "";
    private static String oneLetter = "t";






    @BeforeAll
    static void createClass(){

        isUnique = new Q01_IsUnique();


    }



    @Test
    void isUniqueBruteForce() {

        assertTrue(isUnique.isUniqueBruteForce(gato));
        assertTrue(isUnique.isUniqueBruteForce(Ggato));
        assertFalse(isUnique.isUniqueBruteForce(palavra));
        assertTrue(isUnique.isUniqueBruteForce(emptyString));
        assertTrue(isUnique.isUniqueBruteForce(oneLetter));



    }

    @Test
    void isUniqueSorting() {

        assertTrue(isUnique.isUniqueSorting(gato));
        assertTrue(isUnique.isUniqueSorting(Ggato));
        assertFalse(isUnique.isUniqueSorting(palavra));
        assertTrue(isUnique.isUniqueSorting(emptyString));
        assertTrue(isUnique.isUniqueSorting(oneLetter));

    }

    @Test
    void isUniqueWithHashmap() {
        assertTrue(isUnique.isUniqueWithHashmap(gato));
        assertTrue(isUnique.isUniqueWithHashmap(Ggato));
        assertFalse(isUnique.isUniqueWithHashmap(palavra));
        assertTrue(isUnique.isUniqueWithHashmap(emptyString));
        assertTrue(isUnique.isUniqueWithHashmap(oneLetter));

    }
}