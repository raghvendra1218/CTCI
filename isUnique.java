package com.raghvendra.ctci;

public class isUnique {
    public boolean isUnique(String s){
        char[] wordMap = new char[255];
        for (char c : s.toCharArray()){
            wordMap[c]++;
        }
        for(int i : wordMap){
            if(i > 1){
                return false;
            }
        }
        return true;
    }
}
