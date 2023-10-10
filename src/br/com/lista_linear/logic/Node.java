package br.com.lista_linear.logic;

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    protected int getData() {
        return data;
    }

    protected Node getNext() {
        return next;
    }

    protected void setNext(Node next) {
        this.next = next;
    }
}
