//cycle is present or not
// public class LinkedList_java3 {
//     static class Node{
//        int data;
//        Node next;

//        Node(int data){
//         this.data = data;
//        }
//     }

//     public static class linkedlist{
//         Node head = null;
//         Node tail = null;

//     void insertAtHead(int val){
//         Node temp = new Node(val);

//         if(head == null){
//             head = temp;
//             tail = temp;
//         }
//         else{
//             temp.next = head;
//             head = temp;
//         }
//     }

//     void insertAtTail(int val){
//         Node temp = new Node(val);

//         if(head == null){
//             head = temp;
//             tail = temp;
//         }
//         else{
//             tail.next = temp;
//             tail = temp;
//         }
//     }

//     boolean findcircle(){
//         if(head == null || head.next == null) return false;
//         Node fast = head;
//         Node slow = head;

//         while(fast != null){
//             if(fast.next == null) return false;
//             fast = fast.next.next;
//             if(slow == null) return false;
//             slow = slow.next;
//             if(fast == slow)return true;
//         }
//         return false;
//     }
    
//     void print(){
//         Node temp = head;

//         while(temp != null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }
//   public static void main(String args[]){
//     linkedlist li = new linkedlist();
//     li.insertAtHead(90);
//     li.insertAtHead(234);
//     li.insertAtHead(31);
//     li.insertAtTail(123);
//     li.insertAtTail(324);
//     li.insertAtTail(43);
//     li.print();
//     System.out.println(li.findcircle());
//   }
// }

//print first node of cycle
public class LinkedList_java3{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static boolean findcycle(Node n1){
        if(n1 == null || n1.next == null) return false;
        Node slow = n1;
        Node fast = n1;

        while(fast != null){
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(slow == null) return false;
            slow = slow.next;

            if(fast ==slow) return true;
        }
        return false;
    }

    public static void firstNodeCycle(Node n1){
        Node slow = n1;
        Node fast = n1;

        while(slow != fast){
            if(slow == null) System.out.print("Cycle is not present");
            slow = slow.next;

            if(fast.next == null) System.out.print("Cycle is not present");
            fast = fast.next.next;
       }

       Node temp = n1;
       while(temp == slow){
        temp = temp.next;
        slow = slow.next;
       }
       System.out.print("jkj");
    }


    public static void main(String args[]){
        Node n1 = new Node(90);
        Node n2 = new Node(932);
        Node n3 = new Node(123);
        Node n4 = new Node(43);
        Node n5 = new Node(78);
        Node n6 = new Node(190);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n3;

        System.out.print(findcycle(n1));
        firstNodeCycle(n1);

    }
}