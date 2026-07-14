package com.gabriel.dsa_studies.Execices.ctcichapter01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q03_URLifyTest {

    private static Q03_URLify URLify;

    private static String euTeAmoString = "Eu te amo    ";
    private static String oneLetterString = "A B C    ";



    @BeforeAll
    static void createClass(){

        URLify = new Q03_URLify();
    }


    @Test
    void URLifyTwoPointers() {

        assertEquals(URLify.URLifyTwoPointers(euTeAmoString, 9), "Eu%20te%20amo");
        assertEquals(URLify.URLifyTwoPointers(oneLetterString, 5), "A%20B%20C");


    }
}