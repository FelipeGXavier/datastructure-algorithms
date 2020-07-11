package com.datastructure.queue;

public class Queue<T> {

    private Node<T> head;
    private Node<T> last;


    public void add(T value) {
        Node<T> node = new Node<>(null, value);
        if (this.isEmpty()) {
            this.head = node;
        } else {
            this.last.setNext(node);
        }
        this.last = node;
    }

    public void remove() {
        if (!this.isEmpty()) {
            this.head = this.head.getNext();
            if (this.head == null) {
                this.last = null;
            }
        }
    }

    public T peek(){
        if(!this.isEmpty()){
            return this.head.getValue();
        }
        return null;
    }


    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

}
