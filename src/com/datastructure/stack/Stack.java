package com.datastructure.stack;

public class Stack<T> {


    private Node<T> head;

    public void add(T value) {
        Node<T> node = new Node<>(null, value);
        if (this.isEmpty()) {
            this.head = node;
        } else {
            Node<T> prev = this.head;
            this.head = node;
            this.head.setNext(prev);
        }
    }

    public T peek(){
        if(!this.isEmpty()){
            return this.head.getValue();
        }
        return null;
    }

    public void pop(){
        if(!this.isEmpty()){
           this.head = this.head.getNext();
        }
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }


}
