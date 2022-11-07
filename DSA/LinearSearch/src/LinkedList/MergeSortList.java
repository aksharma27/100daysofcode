package LinkedList;

public class MergeSortList {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    static Node head;


    static int half(){
        Node slow = head;
        Node fast = head;
        int count = 0;
        while (fast != null && fast.next != null){
            count++;
            slow = slow.next;
            fast = fast.next.next;
        }
        return count;
    }


    static void mergeSort(){
        
    }
}
