package LinkedList;

public class LinkedList {
    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;


    //create list
    static void createList(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            newNode = head;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }



    //display list
    static void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data );
            temp = temp.next;
        }
    }



    //get size:
    static int getSize(){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
        }
        return count;
    }



    //get first data:
    static  int getFirst(){
        Node temp = head;
        if (temp == null)
            return Integer.MIN_VALUE;
        else
            return head.data;
    }


    //get last data:
    static int getLast(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp.data;
    }


    //get at(specified index):
    static int getAt(int index){
        int count = 0;
        Node temp = head;
        while (temp != null && count != index){
            temp = temp.next;
            count++;
        }
        return temp.data;
    }

    public static void main(String[] args) {
        createList(2);
        createList(3);
        createList(4);
        createList(0); createList(19); createList(40);
        display();
//        System.out.println("\n" + getAt(3));
        System.out.println(getFirst() + " " + getLast());

    }
}

