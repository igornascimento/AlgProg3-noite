package com.Aps01.datastructures;

/**
 * Node class
 */
public class Node<T> {

    private T value;
    private Node previous;
    private Node next;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node<T> node) {
        this.previous = node;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

}
