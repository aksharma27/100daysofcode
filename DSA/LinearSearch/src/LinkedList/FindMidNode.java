package LinkedList;

public class FindMidNode {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.next = null;
            this.data = data;
        }
    }
    static Node head;

    static void addNode(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    static int getMid(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }


    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        addNode(6);
        addNode(7);
        addNode(8);
        addNode(9);
//        addNode(10);
        System.out.println(getMid());
    }
}
