package LinkedList;
//push at first of list like a stack -> addfirst()
//pop like a stack in list -> removefirst()
//peek like a stack in list -> getFirst()
public class LLStackAdapter {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;

    static void pus(int data){
        addFirst(data);
    }
    static int pop(){
        return removeFirst();
    }
    static int top(){
        return getFirst();
    }

    static void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    static int removeFirst(){
        Node temp = head;
        if (head == null){
            return Integer.MIN_VALUE;
        }
        temp = temp.next;
        head = temp;
        return head.data;
    }

    static int getFirst(){
        Node temp = head;
        if (head == null){
            return Integer.MIN_VALUE;
        }
        return temp.data;
    }


}
