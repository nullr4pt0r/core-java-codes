package IteraTABLE;

import java.util.Iterator;

public class Node implements Iterable{
    int data;
    Node next;

    public Node(int x){
        data = x;
        next = null;
    }

    public Node(int x, Node node){
        data = x;
        next = node;
    }


    @Override
    public Iterator iterator() {
        return new NodeIterator(this);
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(30);
        node.next.next.next = new Node(40);

        for(Object i:node){
            System.out.println(i);
        }
    }
}
