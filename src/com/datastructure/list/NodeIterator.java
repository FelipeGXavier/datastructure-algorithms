package com.datastructure.list;

import java.util.Iterator;

public class NodeIterator<T> implements Iterator<T> {

    private Node<T> current;

    public NodeIterator(LinkedList<T> list) {
        this.current = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return this.current != null;
    }

    @Override
    public T next() {
        T data = this.current.getData();
        this.current = this.current.getNext();
        return data;
    }
}
