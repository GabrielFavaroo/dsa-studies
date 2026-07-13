package com.gabriel.dsa_studies.Execices.ctcichapter01;

import java.util.Arrays;
import java.util.HashMap;

public class Q01_IsUnique {


    public Boolean isUniqueBruteForce(String word){

        if(word.length() <= 1) return true;


        for(int i = 0; i < word.length() - 1; i++){
            for(int j = i + 1; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j))return false;
            }
        }

        return true;
    }

    public Boolean isUniqueSorting(String word){

        if(word.length() <= 1) return true;


        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        var sortedWord = new String(chars);

        for(int i = 0; i < sortedWord.length() - 1;i++){
            if(sortedWord.charAt(i) == sortedWord.charAt(i + 1))return false;

        }

        return true;
    }

    public Boolean isUniqueWithHashmap(String word){

        if(word.length() <= 1) return true;

        HashMap<Character,Integer> registry = new HashMap<>();

        for (char character : word.toCharArray()){
            if(!registry.containsKey(character)) registry.put(character,1);
            else return false;
        }

        return true;
    }

}
