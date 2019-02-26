package com.raghvendra.ctci.LinkedList;

public class ReturnKthToLast {
    public int returnKth(LinkedList.Node head, int k){
        int count = 0;
        LinkedList.Node current = head;
        LinkedList.Node previous = head;

        while(current != null){
            if(count >= k) previous = previous.next;
            current = current.next;
            count++;
        }
        return previous.data;
    }
}
