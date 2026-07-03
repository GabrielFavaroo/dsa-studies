package com.gabriel.dsa_studies.Execices.ctcichapter01;

public class Q05_OneAway {

    public Boolean oneAwayWithPointers(String firstWord, String secondWord){

        String larger;
        String tiny;


        if(firstWord.length() <= secondWord.length()) {
            tiny = firstWord;
            larger = secondWord;
        }
        else{tiny = secondWord; larger = firstWord;}

        var difference =  larger.length() - tiny.length();

        if(difference >= 2) {
            return false;
        }

        var edits = 0;
        int index = 0;

        if(difference == 1){
            var skip = 0;
            while (index < tiny.length() || edits <= 1){

                if(tiny.charAt(index) != larger.charAt(index + skip) ){
                    if(tiny.charAt(index) == larger.charAt(index + 1)) {
                        skip++;
                        edits++;
                    }
                }

                index++;

            }

            if(edits < 1)edits++;
        }

        else{

            while (index < tiny.length() || edits <= 1){

                if(tiny.charAt(index) != larger.charAt(index)) edits++;
                index++;
            }

        }


        return edits <= 1 ? true : false;
    }


}
