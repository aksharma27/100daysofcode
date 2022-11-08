package StacksQueues.STACK;

public class Stack {

    static final int MAX = 1000;
    static int top;
    static int[] A = new int[MAX];

    Stack(){
        top = -1;
    }

    static boolean isEmpty(){
        return top < 0;
    }

    static boolean push(int x){
        if (top >= MAX - 1){
            System.out.println("underflow");
            return false;
        }
        else {
            A[++top] = x;
            return true;
        }
    }

    static int pop(){
        if (top < 0){
            return Integer.MIN_VALUE;
        }
        else {
            int x = A[top--];
            return x;
        }
    }

    static int peek(){
        if (top < 0){
            System.out.println("Underflow");
            return 0;
        }
        else{
            int x = A[top];
            return x;
        }
    }
    static void print(){
        for (int i = top; i > -1; i--){
            System.out.println(" " + A[i]);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
    }

    }


