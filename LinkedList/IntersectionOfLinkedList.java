package com.raghvendra.ctci.LinkedList;

public class IntersectionOfLinkedList {
    public LinkedList.Node intersectionPoint(LinkedList.Node head1, LinkedList.Node head2){
        LinkedList.Node curr1 = head1;
        LinkedList.Node curr2 = head2;
        int lengthOne = 0;
        int lengthTwo = 0;
        while(curr1 != null){
            lengthOne++;
            curr1 = curr1.next;
        }

        while(curr2 != null){
            lengthTwo++;
            curr2 = curr2.next;
        }
//        System.out.println(curr1.data);
//        System.out.println(curr2.data);
        if(curr1 != curr2) {
            System.out.println("Lists do not intersect");
            return null;
        }
        curr1 = head1;
        curr2 = head2;
        int diff = (lengthOne > lengthTwo) ? lengthOne - lengthTwo : lengthTwo - lengthOne;
        if(lengthOne > lengthTwo){
            System.out.println("her");
            for(int i = 0; i<diff; i++){
                curr1 = curr1.next;
            }
        } else if(lengthOne < lengthTwo) {
            System.out.println("here");
            for(int i = 0; i < diff; ++i){
                curr2 = curr2.next;
            }
        }
        //Now both the list will meet at the point of intersection, which we will return
        while(curr1 != curr2){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr2;
    }
}
