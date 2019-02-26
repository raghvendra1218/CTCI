package com.raghvendra.ctci.LinkedList;

public class DeleteMiddleNode {
    public void deleteNode(LinkedList.Node node){
        LinkedList.Node temp = node;
        temp = node.next;
        node.data = node.next.data;
        node.next = temp.next;
        temp.next = null;
    }
}
