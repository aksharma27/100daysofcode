package StacksQueues.STACK;

public class StackList {
    static class Node {
        int data;
        Node next;

        Node(int data) { this.data = data; this.next = null;}
    }

    static Node head;
    static void createList(int x){
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    static boolean isEmpty(){
        return (head == null);
    }
    static int pop(){
        int popped = Integer.MIN_VALUE;
        if (head == null){
            System.out.println("empty stack");
        }
        else {
            popped = head.data;
            head = head.next;
        }
        return popped;
    }

    static int peek(){
        if (head == null){
            System.out.println("empty stack");
            return Integer.MIN_VALUE;
        }
            return head.data;
    }

    static void push(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    static void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        createList(2);
        createList(3);
        createList(4);
        createList(5);
        createList(7);
        printList();
        System.out.println();
        push(10);
        printList();
        pop();

        System.out.println(peek());

    }

}
