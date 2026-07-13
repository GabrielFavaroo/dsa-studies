package com.gabriel.dsa_studies.Execices.ctcichapter01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Q07_RotateMatrixTest {

    private static Q07_RotateMatrix rotateMatrix;

    private static byte[][] threeTimesThreeMatrix = {{1,2,3},
                                                     {4,5,6},
                                                     {7,8,9}};

    private static byte[][] threeTimesThreeExpectedMatrix = {{7,4,1},
                                                             {8,5,2},
                                                             {9,6,3}};




    private static byte[][] twoTimesTwoMatrix = {{1,2},
                                                 {3,4}};

    private static byte[][] twoTimesTwoExpectedMatrix = {{3,1},
                                                         {4,2}};


    private static byte[][] sevenTimesSevenMatrix = {{1,0,0,0,0,0,0},
                                                     {0,0,0,0,0,0,0},
                                                     {0,0,0,0,0,0,0},
                                                     {0,0,0,0,0,0,0},
                                                     {0,0,0,0,0,0,0},
                                                     {0,0,0,0,0,0,0},
                                                     {0,0,0,0,0,0,0},
    };


    private static byte[][] sevenTimesSevenExpectedMatrix = {{0,0,0,0,0,0,1},
                                                             {0,0,0,0,0,0,0},
                                                             {0,0,0,0,0,0,0},
                                                             {0,0,0,0,0,0,0},
                                                             {0,0,0,0,0,0,0},
                                                             {0,0,0,0,0,0,0},
                                                             {0,0,0,0,0,0,0},
    };



    @BeforeAll
    static void createClass(){
        rotateMatrix = new Q07_RotateMatrix();
    }

    @Test
    void rotateMatrix() {


        assertArrayEquals(rotateMatrix.rotateMatrix(threeTimesThreeMatrix), threeTimesThreeExpectedMatrix);
        assertArrayEquals(rotateMatrix.rotateMatrix(twoTimesTwoMatrix), twoTimesTwoExpectedMatrix);
        assertArrayEquals(rotateMatrix.rotateMatrix(sevenTimesSevenMatrix), sevenTimesSevenExpectedMatrix);



    }}



