package com.hyperskill;

public class WordComplexity {

    public static double getWordComplexity(String word) {
/*
Calculate complexity using following formula:
1. each letter r (any case) is +1. Each syllable is 0.5.
For example margarīns has 3 syllabes: mar-ga-rīns and has 2 r letters, which is complexity 3.5
*/
        word = word.toLowerCase() + "_";
        Double complexity = 0.0;
        complexity += word.split("r").length-1;
        complexity += (word.split("[a,ā,e,ē,i,ī,o,u,ū]").length-1)*0.5;

        return complexity;
    }
}
