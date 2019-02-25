package com.raghvendra.ctci;

public class PalindromePermutation {
    public boolean canFormPalindrome(String str){
        /**
         * Approach 1 : We are Iterating through entire set of character Array twice
         */

//        int[] wordMap = new int[255];
//        int [] wordMap = new int[Character.getNumericValue('z') - Character.getNumericValue('a') +1];
//        int sum = 0;
//        for(char c : str.toLowerCase().toCharArray()){
//            wordMap[c-'a']++;
//        }
//
//        for(int i = 0; i <wordMap.length; ++i){
//            wordMap[i] = wordMap[i] %2;
//            sum += wordMap[i];
//        }
//
//        if(sum > 1) return false;
//        return true;

        /**
         * Approach 2 : We can iterate through the character array and keep the odd count while the same loop
         */

        int countOdd = 0;

        //create a word map of 26 for storing the count of all the letters
//        int [] wordMap = new int[Character.getNumericValue('z') - Character.getNumericValue('a') +1];
        int[] wordMap = new int[26];
        for(char c : str.toLowerCase().toCharArray()){
            //Only allowing the alphabets to pass through
            if(Character.isLetter(c)){
                wordMap[c - 'a']++;
                //Increasing the countOdd each time if the below operation spits 1, once done with each chars countOdd should not be greater than 1
                if(wordMap[c - 'a'] %2 == 1){
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        if(countOdd > 1) return false;
        return true;
    }
}
