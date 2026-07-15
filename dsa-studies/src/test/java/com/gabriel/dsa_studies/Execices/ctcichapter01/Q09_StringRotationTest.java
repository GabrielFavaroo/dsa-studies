package com.gabriel.dsa_studies.Execices.ctcichapter01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q09_StringRotationTest {


    private static Q09_StringRotation stringPermutation;
    private static String megamanString = "megaman";
    private static String megamanRotatedString = "amanmeg";
    private static String sameSizeMegamanFakeRotatedString = "omanmag";
    private static String differentSizeString = "iamnotthemegamanstring";
    private static String totallyDifferentStringWithSameSize = "1234567";
    private static String emptyString = "";

    @BeforeAll
    static void createClass(){
        stringPermutation = new Q09_StringRotation();
    }



    @Test
    void validStringRotation() {

        assertTrue(stringPermutation.validStringRotation(megamanString,megamanRotatedString));
        assertFalse(stringPermutation.validStringRotation(megamanString, sameSizeMegamanFakeRotatedString));
        assertFalse(stringPermutation.validStringRotation(megamanString, differentSizeString));
        assertFalse(stringPermutation.validStringRotation(differentSizeString, sameSizeMegamanFakeRotatedString));
        assertFalse(stringPermutation.validStringRotation(megamanString, totallyDifferentStringWithSameSize));
        assertFalse(stringPermutation.validStringRotation(totallyDifferentStringWithSameSize, emptyString));
    }
}