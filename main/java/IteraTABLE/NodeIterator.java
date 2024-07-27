package IteraTABLE;

import java.util.Iterator;

public class NodeIterator implements Iterator {

    Node current;
    public NodeIterator(Node node) {
        current = node;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Object next() {
        Object i = current.data;
        current = current.next;
        return i;
    }
}
