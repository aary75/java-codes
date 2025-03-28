
public class DoubleLL {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayrev(Node tail){
        Node temp = tail;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Node n1 = new Node(90);
        Node n2 = new Node(23);
        Node n3 = new Node(32);
        Node n4 = new Node(123);
        Node n5 = new Node(45);
        Node n6 = new Node(64);

        n1.prev = null;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = n5;
        n5.prev = n4;
        n5.next = n6;
        n6.prev = n5;
        n6.next = null;

        System.out.println(n1);
        System.out.println(n2.data);
        System.out.println(n2.next.data);
        System.out.println(n3.prev);
        System.out.println(n3.prev.data);

        display(n1);
        displayrev(n6);
    }
}
