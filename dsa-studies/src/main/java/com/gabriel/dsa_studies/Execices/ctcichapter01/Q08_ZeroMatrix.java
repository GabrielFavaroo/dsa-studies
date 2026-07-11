package com.gabriel.dsa_studies.Execices.ctcichapter01;

import java.util.Arrays;
import java.util.HashSet;

public class Q08_ZeroMatrix {

    public int[][] zeroMatrix(int[][] matrix){

        int rows = matrix.length;
        int columns = matrix[0].length;

        HashSet<Integer> rowsWithZeros = new HashSet<>();
        HashSet<Integer> columnsWithZeros = new HashSet<>();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns;j++){
                if(matrix[i][j] == 0);

                rowsWithZeros.add(i);
                columnsWithZeros.add(j);


            }

        }

        for(int index = 0; index < rows; index++){

            for(int row : rowsWithZeros){
                matrix[row][index] = 0;
            }
        }


        for(int index = 0; index < columns; index++){

            for(int column : columnsWithZeros){
                matrix[index][column] = 0;
            }

        }



        return matrix;
    }

}
