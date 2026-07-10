package com.gabriel.dsa_studies.Execices.ctcichapter01;

public class Q09_StringRotation {

    public boolean isSubstring(String firstWord, String secondWord) {
        return secondWord.contains(firstWord);
    }



    public boolean validStringRotation(String firstWord, String secondWord){

        return firstWord.length() == secondWord.length() ? isSubstring(firstWord, secondWord+secondWord) : false;


    }







}
