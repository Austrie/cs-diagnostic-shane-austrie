package com.test;

/**
 * Created by yoyor on 12/9/2017.
 */
public class LLReversal<T> {



    //Problem 15
    public Node<T> reverse(Node<T> head) {

        Node<T> curr = head;
        Node<T> actualNext = curr.next;
        if (actualNext != null) {
            while (actualNext.next != null) {
                Node<T> temp = actualNext.next;
                actualNext.next = curr;

                curr = actualNext;
                actualNext = temp;
            }
            actualNext.next = curr;
            head.next = null;
            return actualNext;
        }
        return head;
    }

    private class Node<T> {
        public Node<T> next;
        public T data;

        public Node(Node<T> next, T data) {
            this.next = next;
            this.data = data;
        }
    }
}
