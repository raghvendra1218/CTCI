package com.raghvendra.ctci;

import com.raghvendra.ctci.ArraysAndStrings.OneAway;
import com.raghvendra.ctci.ArraysAndStrings.PalindromePermutation;

public class Main {

    public static void main(String[] args) {
        /** isUnique */
//        String str = "helo";
//	    isUnique iu = new isUnique();
//        System.out.println("Output: "+ iu.isUnique(str));
        /** Check Permutation */
//        String str1 = "hello", str2 = "lelho";
//        CheckPermutation cp = new CheckPermutation();
//        System.out.println("Output: "+ cp.isPermutation(str1,str2));
        /** URLify String */
//        char[] chars = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
//        URLify url = new URLify();
//        url.urlify(chars,13);
        /** Palindrome Permutation */
        String str = "tact Coaa";
        PalindromePermutation pp = new PalindromePermutation();
        System.out.println("Output: "+ pp.canFormPalindrome(str));
        /** One Away */
//        String str1 = "Pale", str2 = "Pal";
//        OneAway oa = new OneAway();
//        System.out.println("Output: "+oa.checkOneAway(str1,str2));
    }
}
