package com.gabriel.dsa_studies.Execices.ctcichapter01;

public class Q06_StringCompression {

    public String stringCompression (String text){

        StringBuilder compressedString = new StringBuilder();

        int occurrences = 1;

        for (int i = 1; i < text.length(); i++){

            if(i == text.length() - 1){

                if (text.charAt(i - 1) != text.charAt(i)) {
                compressedString.append(text.charAt(i - 1));
                compressedString.append(occurrences);

                occurrences = 1;
                compressedString.append(text.charAt(i));
                compressedString.append(occurrences);

            }
                else {
                occurrences++;
                compressedString.append(text.charAt(i));
                compressedString.append(occurrences);
            }
            }




            else{
                if (text.charAt(i - 1) != text.charAt(i)) {
                    compressedString.append(text.charAt(i - 1));
                    compressedString.append(occurrences);

                    occurrences = 1;
                } else {
                    occurrences++;
                }
            }


        }

        return compressedString.length() < text.length() ? compressedString.toString() : text;
    }
}
