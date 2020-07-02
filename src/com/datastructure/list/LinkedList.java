package com.datastructure.list;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

    private Node<T> head;
    private Node<T> tail;
    private int position = 0;

    public void add(T data){
        Node<T> node = new Node<>(data, null, this.position++);
        if(this.head == null){
            this.head = node;
        }else{
            this.tail.setNext(node);
        }
        this.tail = node;
    }

    public boolean empty(){
        if(this.position == 0){
            return true;
        }
        return false;
    }

    public T get(int position){
        if(!this.empty()){
            Node<T> start = this.head;
            while (start != null){
                if(start.getPosition() == position){
                    return start.getData();
                }
                start = start.getNext();
            }
            throw new RuntimeException("This element does not exist in the current list");
        }
        throw new RuntimeException("Empty list");
    }

    @Override
    public Iterator<T> iterator() {
        return new NodeIterator<>(this);
    }

    public Node<T> getHead() {
        return this.head;
    }

}
