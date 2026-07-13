package com.gabriel.dsa_studies.Execices.ctcichapter01;

import java.util.Arrays;

public class Q07_RotateMatrix {

    public byte[][] rotateMatrix (byte[][] matrix){

        var length = matrix.length;

        var cycles = length % 2 == 0 ? length / 2 : (length - 1)/2;

        for(int layer = 0; layer < cycles; layer++){

            var startingPoint = layer;
            var endingPoint = length - (layer + 2);
            var places = length - (1 + layer);

            byte firstValue;

            byte secondValue;

            while(startingPoint <= endingPoint){

                firstValue = matrix[startingPoint][places+ layer];

                matrix[startingPoint][places+ layer] = matrix[layer][startingPoint];

                secondValue = matrix[places + layer][((places + layer) -startingPoint) + layer];

                matrix[places + layer][((places + layer) -startingPoint) + layer] = firstValue;

                firstValue = matrix[((places + layer) -startingPoint) + layer][layer];

                matrix[((places + layer) -startingPoint) + layer][layer] = secondValue;

                matrix[layer][startingPoint] = firstValue;


                startingPoint++;
            }



        }



        return matrix;
    }

}
