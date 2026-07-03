package com.gabriel.dsa_studies.Execices.ctcichapter01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q02_CheckPermutation {

    // SOCORRAMMESUBINOONIBUSEMMARROCOS   SOCORRAMMEONIBUSEMMARROCOSSUBINO

    public boolean checkPermutationSorting(String firstWord, String secondWord){
        if(firstWord.isEmpty() || secondWord.isEmpty())return false;
        if(firstWord.length() != secondWord.length())return false;

        Arrays.sort(firstWord.toCharArray());
        Arrays.sort(secondWord.toCharArray());

        for(int i = 0; i < firstWord.length(); i++){
            if(firstWord.charAt(i) != secondWord.charAt(i))return false;
        }
        return true;
    }




    public boolean checkPermutationHashmap(String firstWord, String secondWord){
        if(firstWord.isEmpty() || secondWord.isEmpty())return false;
        if(firstWord.length() != secondWord.length())return false;

        HashMap<Character,Integer> firstWordRegistry = new HashMap<>();
        HashMap<Character,Integer> secondWordRegistry = new HashMap<>();

        for(char c : firstWord.toCharArray()){
            if(!firstWordRegistry.containsKey(c))firstWordRegistry.put(c,1);
            else{firstWordRegistry.put(c, firstWordRegistry.getOrDefault(c,0) + 1);}
        }

        for(char c : secondWord.toCharArray()){
            if(!secondWordRegistry.containsKey(c))secondWordRegistry.put(c,1);
            else{secondWordRegistry.put(c, secondWordRegistry.getOrDefault(c,0) + 1);}
        }

        for (Map.Entry<Character, Integer> registry : firstWordRegistry.entrySet()){
            var key = registry.getKey();

            if(!(secondWordRegistry.containsKey(key)) && !(secondWordRegistry.getOrDefault(key, 0) == firstWordRegistry.getOrDefault(key, 0)))return false;


        }





        return true;
    }

}
