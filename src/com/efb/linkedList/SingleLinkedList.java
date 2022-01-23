package com.efb.linkedList;

public class SingleLinkedList {
    //create head
    public Node head;
    public Node tail;
    public int size;

    public Node creatSingleLKinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size =1;
        return head;
    }

    //insert method SingleLinkedList
    public void insertInLinkedList(){}

}


