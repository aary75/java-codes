//find middle element
// public class LinkedList_java2 {
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//         }
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
//         }    
    

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

//     void print(){
//         Node temp = head;

//         while(temp != null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     int length(){
//         Node temp = head;

//         int cnt = 0;
//         while(temp != null){
//             cnt++;
//             temp = temp.next;
//         }

//         return cnt;
//     }

//     void middle(int len){
//         int cnt = 0;

//         Node temp = head;
//         while(cnt < len){
//           temp = temp.next;
//           cnt++;
//         }

//         if(len % 2==0){
//             System.out.print(temp.data);
//         }
//         else{
//             System.out.println(temp.data);
//         }
//     }

//     public static void main(String args[]){
//         linkedlist li = new linkedlist();

//         li.insertAtHead(90);
//         li.insertAtHead(23);
//         li.insertAtTail(32);
//         li.insertAtTail(233);
//         li.insertAtTail(43);
//         li.insertAtHead(2121);
//         li.print();

//         int len = li.length();
//         li.middle(len/2);
//     }
//     }
// }

//delete middle node
public class LinkedList_java2{
     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
     }

     public static class linkedlist{
        Node head = null;
        Node tail = null;

     void insertAtHead(int val){
        Node temp = new Node(val);

        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
     }

     void insertAtTail(int val){
        Node temp = new Node(val);

        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
     }

     void middle(){
        Node fast = head;
        Node slow = head;

     //if odd number of nodes are given, then fast.next != null 
     // if even number of nodes are given and we want to find right middle node then
     // fast.next.next != null
     //for left middle node, fast != null
        while(fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.data = slow.next.data;
        slow.next = slow.next.next;
    }

     void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
     }

    //  void deletemiddle(Node head1){
    //     Node temp = head;

    //     while(temp.next != head1){
    //         temp = temp.next;
    //     }

    //     temp.next = temp.next.next;
    //  }
}

public static void main(String args[]){
    linkedlist li = new linkedlist();
    li.insertAtHead(78);
    li.insertAtHead(23);
    li.insertAtHead(234);
    li.insertAtTail(343);
    li.insertAtTail(91);
    li.insertAtTail(123);
    li.print();
    li.middle();
  //  li.deletemiddle(temp);
    li.print();
}
}
