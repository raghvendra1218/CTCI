package com.raghvendra.ctci.LinkedList;

import java.util.HashSet;

public class RemoveDups {

    public void deleteDuplicates(LinkedList.Node head){
        HashSet<Integer> set = new HashSet<>();
        LinkedList.Node current = head;
        LinkedList.Node previous = head;
        while(current != null){
            if(!set.contains(current.data)){
                set.add(current.data);
                previous = current;
                current = current.next;
            } else {
                previous.next = current.next;
                current = current.next;
            }
        }
    }
}
