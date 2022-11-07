package LinkedList;

public class GetNodeFromBack {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.next = null;
            this.data = data;
        }
    }

    static void addNode(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static Node head;
    static int getFromEnd(int index){
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < index; i++){        //to keep a gap to index between slow and fast
            fast = fast.next;
        }

        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
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

        int ans = getFromEnd(4);
        System.out.println(ans);
    }
}
