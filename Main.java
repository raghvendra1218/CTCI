package com.raghvendra.ctci;

import com.raghvendra.ctci.ArraysAndStrings.OneAway;
import com.raghvendra.ctci.ArraysAndStrings.PalindromePermutation;
import com.raghvendra.ctci.ArraysAndStrings.StringCompression;
import com.raghvendra.ctci.LinkedList.LinkedList;
import com.raghvendra.ctci.LinkedList.RemoveDups;
import com.raghvendra.ctci.LinkedList.ReturnKthToLast;

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
//        String str = "tact Coaa";
//        PalindromePermutation pp = new PalindromePermutation();
//        System.out.println("Output: "+ pp.canFormPalindrome(str));
        /** One Away */
//        String str1 = "Pale", str2 = "Pal";
//        OneAway oa = new OneAway();
//        System.out.println("Output: "+oa.checkOneAway(str1,str2));
        /** String Compression */
//        String str = "";
//        StringCompression sc = new StringCompression();
//        sc.compress(str);


        /**
         * Linked List
         */


        /**
         * Create a Link List
         */
        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);
        LinkedList.Node fourth = new LinkedList.Node(4);
        LinkedList.Node fifth = new LinkedList.Node(2);
        LinkedList.Node sixth = new LinkedList.Node(2);
        LinkedList.Node seventh = new LinkedList.Node(3);
        LinkedList.Node eight = new LinkedList.Node(4);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        System.out.print("Input: ");
        list.printList();
        System.out.println();

        /** Remove Duplicates */
//        RemoveDups rd = new RemoveDups();
//        rd.deleteDuplicates(LinkedList.head);
//        System.out.print("Output: ");
//        list.printList();

        /** Return Kth to Last */
        ReturnKthToLast rk = new ReturnKthToLast();
        System.out.println("Output: "+ rk.returnKth(LinkedList.head, 5));

        /** Delete Middle Node */

    }

}
