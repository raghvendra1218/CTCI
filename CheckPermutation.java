package com.raghvendra.ctci;

public class CheckPermutation {
    public boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] wordMap = new int[255];

        //Store the count values for both the strings in wordMap
        for(int i = 0; i < s1.length(); ++i){
            wordMap[s1.charAt(i)]++;
            wordMap[s2.charAt(i)]--;
        }

        //if the Strings are palindrome then wordMap will have zero value at each index, else there will be non zero values
        //and the strings will not be a permutation of the first one
        for(int i : wordMap){
            if(i !=0) return false;
        }
        return true;
    }
}
