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
        if (temp == null){
            return Integer.MIN_VALUE;
        }
        while (temp != null){
            temp = temp.next;
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



    //add first
    static void addFirst(int data){
        Node first = new Node(data);
        Node temp = head;
        if (temp == null){
            head = first;
        }
        else {
            first.next = head;
            head = first;
        }
    }


    //add at:
    static void addAt(int data, int prevIndex){
        Node at = new Node(data);
        int count = 0;
        Node temp = head;
        while (temp != null && count != prevIndex){
            temp = temp.next;
            count++;
        }
        Node tempNext = temp.next;
        temp.next = at;
        at.next = tempNext;
    }



    //add last:
    static void addLast(int data) {
        Node lastNew = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = lastNew;
    }



    //remove last:
    static void removeLast(){
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }



    //remove first:
    static void removeFirst(){
        Node temp = head;
        head = temp.next;
    }



    //remove at:
    static void removeAt(int index){
        Node temp = head;
        if (index < 0 || index > getSize()){
            System.out.println("invalid arguments");
        }
        else if(index == 0){
            removeFirst();
        }
        else if (index == getSize() - 1){
            removeLast();
        }
        else {
            int count = 0;
            while (temp != null && count != index - 1){
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
        }
    }



    //reverse linked list:
    private static Node getNodeAt(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;        //returns node only, not node data
    }
    public static void reverseNode(){
        int leftIndex = 0;
        int rightIndex = getSize() - 1;
        while (leftIndex < rightIndex){
            Node left = getNodeAt(leftIndex);
            Node right = getNodeAt(rightIndex);
            leftIndex++;
            rightIndex--;

            //now swap both datas
            int temp = left.data;
            left.data = right.data;
            right.data = temp;
        }
    }



    //get tail
    static Node getTail(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }




    //reverse pointer iterative
//    public static void reversePI(){
//        Node prev = null;
//        Node current = head;
//        while (current != null){
//            Node originalCurrentNext = current.next;
//
//            current.next = prev;
//
//            prev = current;
//            current = originalCurrentNext;
//        }
//
//        //finally swap head and tail
//        Node tail = getTail();
//        Node temp = head;
//        head = tail;
//        tail = temp;
//    }

    public static void main(String[] args) {
        createList(2);
        createList(3);
        createList(4);
        createList(0); createList(19); createList(40);
//        display();
//        System.out.println("\n" + getAt(3));
//        System.out.println(getFirst() + " " + getLast());
          addFirst(90);
          addAt(100, 2);
          addLast(11);
         removeAt(2);
          System.out.println();
          display();
    }
}

