//package LinkedList;
//
//public class MergeSortList {
//    static class Node{
//        int data;
//        Node next;
//        Node(int d){
//            this.data = d;
//            this.next = null;
//        }
//    }
//    static Node head;
//
//
//    static Node half(){
//        Node slow = head;
//        Node fast = head;
//        int count = 0;
//        while (fast != null && fast.next != null){
//            count++;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//
//    static void createList(int data){
//        Node node = new Node(data);
//        node.next = head;
//        head = node;
//    }
//
//
//    static void mergeSort(){
//        int half = half();
//
//    }
//}
