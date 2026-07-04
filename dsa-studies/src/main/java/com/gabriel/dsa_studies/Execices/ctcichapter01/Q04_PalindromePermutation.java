package com.gabriel.dsa_studies.Execices.ctcichapter01;

public class Q04_PalindromePermutation {

    public Boolean palindromePermutationWithHashmap (String word){

        HashMap<Character,Integer> occurrences = new HashMap<>();

        for(char c : word.toCharArray()){

            if(!occurrences.containsKey(c)){
                occurrences.put(c,1);
            }
            else{
                occurrences.put(c,occurrences.getOrDefault(c,0)+1);
            }

        }

        switch (word.length()){

            case 0: for (Map.Entry<Character, Integer> map : occurrences.entrySet()) {
                if(map.getValue() % 2 != 0){return false;}

            }

            case 1: for (Map.Entry<Character, Integer> map : occurrences.entrySet()) {
                if(map.getValue() % 2 != 0){return true;}

            }


        }

        

        return false;

    }


}
