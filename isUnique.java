package com.raghvendra.ctci;

public class isUnique {
    public boolean isUnique(String s){
        int[] wordMap = new int[255];
        for (char c : s.toCharArray()){
            wordMap[c]++;
            if(wordMap[c] > 1) return false;
        }
        return true;
    }
}
