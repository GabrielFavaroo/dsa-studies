package com.gabriel.dsa_studies.Execices.ctcichapter01;

import java.util.Arrays;

public class Q03_URLify {

    public String URLifyTwoPointers (String text, int trueSize){

        //Eu_te_amo____
        var array = text.toCharArray();
        int nullSpaces = 0;

        for(int i = 0;i < trueSize; i++){
            if(array[i] == ' '){
                nullSpaces++;
            }
        }


        int lastIndex = nullSpaces * 2 + trueSize;

        for(int i = trueSize - 1; i >= 0; i--){
            if(array[i] != ' '){
                array[lastIndex - 1] = array[i];
                lastIndex--;
            }
            else{
                array[lastIndex - 1] = '0';
                array[lastIndex - 2] = '2';
                array[lastIndex - 3] = '%';
                lastIndex = lastIndex - 3;
            }
        }


        return new String(array);
    }

}
