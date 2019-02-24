package com.raghvendra.ctci;

import java.util.Arrays;

public class URLify {
    public void urlify(char[] chars, int trueLength){
        System.out.println("Input: "+ Arrays.toString(chars));

        //Calculate number of white-spaces in the character Array
        int whiteSpaces = 0;
        for(int i = 0; i <trueLength; ++i){
            if(chars[i] == ' '){
                whiteSpaces++;
            }
        }

        //initialise an index variable to the actual size of array required to fit the additional characters
        // and traverse the character array backwards from true length.
        int index = trueLength + whiteSpaces * 2;

        for(int i = trueLength-1; i >=0; --i){
            if(chars[i] == ' '){
                chars[index - 1] = '0';
                chars[index - 2] = '2';
                chars[index - 3] = '%';
                index -= 3;
            } else {
                chars[index - 1] = chars[i];
                index --;
            }
        }
        System.out.println("Output: "+ Arrays.toString(chars));
    }
}
