package com.raghvendra.ctci.LinkedList;

public class LoopDetection {
    public LinkedList.Node detectLoop(LinkedList.Node head){
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;

        while (fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                    if(slow == fast){
                        return fast;
                    }
                }
            }
        }
        return null;
    }
}
