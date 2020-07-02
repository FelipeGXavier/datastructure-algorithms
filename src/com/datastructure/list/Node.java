package com.datastructure.list;

public class Node<T> {

    private T data;
    private int position;
    private Node<T> next;


    public Node(T data, Node<T> next, int position) {
        this.data = data;
        this.next = next;
        this.position = position;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
