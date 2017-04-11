package com.Aps01.datastructures;

import java.util.Iterator;

/**
 * Matrix class
 */
public class Matrix<T> implements Iterable<T> {

    /**
     * Iterator innerclass for the matrix
     */
    public class MatrixIterator implements Iterator<T> {
        private Node<T> actual;
        private Matrix<T> container;

        public MatrixIterator(Matrix<T> matrix) {
            actual = null;
            container = matrix;
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

        @Override
        public void insert(T value) {
            if (actual == null) {
                throw new IllegalStateException(new String("Use next() before using an iterator."));
            }
            Node<T> node = new Node<>(value);
            Node<T> previous = actual;

            node.setNext(actual);
            node.setPrevious(previous);
            actual.setPrevious(node);

            if (previous == null) {
                head = node;
            } else {
                previous.setNext(node);
            }
        }
    }


    /**
     * Matrix class definition
     */
    private Node<T> head;
    private Node<T> tail;

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

    public java.util.Iterator<T> iterator() {
        return new MatrixIterator(this);
    }

    public void addFirst(T value) {
        Node<T> node = new Node<>(value);
        Node<T> next = head;
        if (next == null) {
            tail = node;
        } else {
            node.setNext(next);
        }
        head = node;
    }

    public boolean isEmpty() {
        return head == null;
    }



}
