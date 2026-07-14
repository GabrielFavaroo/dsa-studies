package com.gabriel.dsa_studies.Execices.ctcichapter01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q08_ZeroMatrixTest {

    private static Q08_ZeroMatrix zeroMatrix;

    private static int[][] threeTimesThreeMatrix = {{1,0,3},
                                                    {4,5,6},
                                                    {7,8,9}};

    private static int[][] threeTimesThreeExpectedMatrix = {{0,0,0},
                                                            {4,0,6},
                                                            {7,0,9}};

    private static int[][] fiveTimesFiveMatrix = {{0,1,1,1,1},
                                                  {1,0,1,1,1},
                                                  {1,1,0,1,1},
                                                  {1,1,1,0,1},
                                                  {1,1,1,1,0}
    };

    private static int[][] fiveTimesFiveExpectedMatrix = {{0,0,0,0,0},
                                                          {0,0,0,0,0},
                                                          {0,0,0,0,0},
                                                          {0,0,0,0,0},
                                                          {0,0,0,0,0}
    };




    private static int[][] twoTimesTwoMatrix = {{0,2},
                                                {3,4}};

    private static int[][] twoTimesTwoExpectedMatrix = {{0,0},
                                                        {0,4}};


    private static int[][] sevenTimesSevenMatrix = {{1,1,1,1,1,1,1},
                                                    {1,1,1,1,1,1,1},
                                                    {1,1,1,1,1,1,1},
                                                    {1,1,1,0,1,1,1},
                                                    {1,1,1,1,1,1,1},
                                                    {1,1,1,1,1,1,1},
                                                    {1,1,1,1,1,1,1}
    };


    private static int[][] sevenTimesSevenExpectedMatrix = {{1,1,1,0,1,1,1},
                                                            {1,1,1,0,1,1,1},
                                                            {1,1,1,0,1,1,1},
                                                            {0,0,0,0,0,0,0},
                                                            {1,1,1,0,1,1,1},
                                                            {1,1,1,0,1,1,1},
                                                            {1,1,1,0,1,1,1}
    };


    @BeforeAll
    static void createClass(){
        zeroMatrix = new Q08_ZeroMatrix();
    }



    @Test
    void zeroMatrix() {

        assertArrayEquals(zeroMatrix.zeroMatrix(twoTimesTwoMatrix), twoTimesTwoExpectedMatrix);
        assertArrayEquals(zeroMatrix.zeroMatrix(threeTimesThreeMatrix),threeTimesThreeExpectedMatrix );
        assertArrayEquals(zeroMatrix.zeroMatrix(fiveTimesFiveMatrix),fiveTimesFiveExpectedMatrix );
        assertArrayEquals(zeroMatrix.zeroMatrix(sevenTimesSevenMatrix), sevenTimesSevenExpectedMatrix);

    }
}