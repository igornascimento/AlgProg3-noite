package com.Aps01.datastructures;

import java.util.Iterator;

/**
 * LinkedList class
 */
public class LinkedList<T> implements Iterable<T> {

    /**
     * Iterator innerclass for the matrix
     */
    public class ListIterator implements Iterator<T> {
        private Node<T> actual;
        private LinkedList<T> container;

        public ListIterator(LinkedList<T> linkedList) {
            actual = null;
            container = linkedList;
        }

        public boolean hasNext() {
            return actual == null || actual.getNext() != null;
        }

        public T next() {
            if (actual == null) {
                actual = head;
            } else {
              actual = actual.getNext();
            }
            if (actual == null) {
                throw new IllegalStateException(new String("List is empty."));
            }
            return actual.getValue();
        }

        public void append(T value) {
            if (actual == null) {
                throw new IllegalStateException(new String("Use next() before using an iterator."));
            }
            Node<T> node = new Node<>(value);
            Node<T> previous = actual;
            Node<T> next = actual.getNext();

            node.setPrevious(previous);
            node.setNext(next);
            previous.setNext(actual);

            if (next == null) {
                container.tail = node;
            } else {
                next.setPrevious(node);
            }
        }

        public void insert(T value) {
            if (actual == null) {
                throw new IllegalStateException(new String("Use next() before using an iterator."));
            }
            Node<T> node = new Node<>(value);
            Node<T> previous = actual.getPrevious();

            node.setNext(actual);
            node.setPrevious(previous);
            actual.setPrevious(node);

            if (previous == null) {
                head = node;
            } else {
                previous.setNext(node);
            }
        }

        public void remove() {
            if (container.head == container.tail) {
                actual = container.tail = container.head = null;
            } else if (actual == container.tail) {
                actual = actual.getPrevious();
                container.tail = actual;
                actual.setNext(null);
            } else if (actual == container.head) {
                actual = actual.getNext();
                actual.setPrevious(null);
                container.head = actual;
            } else {
                Node<T> previous = actual.getPrevious();
                Node<T> next = actual.getNext();
                previous.setNext(next);
                next.setPrevious(previous);
            }
        }

    }


    /**
     * LinkedList class definition
     */
    private Node<T> head;
    private Node<T> tail;

    public java.util.Iterator<T> iterator() {
        return new ListIterator(this);
    }

    public void append(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
        } else {
          node.setPrevious(tail);
          tail.setNext(node);
        }
        tail = node;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
