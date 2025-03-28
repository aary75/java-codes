// public class LinkedList_java1 {
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

//         void insertAtHead(int val){
//             Node temp = new Node(val);

//             if(head == null){
//                 head = temp;
//                 tail = temp;
//             }
//             else{
//                 temp.next = head;
//                 head = temp;
//             }
//         }

//         void insertAtTail(int val){
//             Node temp = new Node(val);

//             if(head == null){
//                 head = temp;
//                 tail = temp;
//             }
//             else{
//                 tail.next = temp;
//                 tail = temp;
//             }
//         }

//         void insertAtPosition(int val,int position){
//             Node temp = head;
            
//             int cnt = 1;
//             while(cnt < position-1){
//                 temp = temp.next;
//                 cnt++;
//             }

//             Node temp1 = new Node(val);
//             temp1.next = temp.next;
//             temp.next = temp1;
//         }

//         void delete(int position){
//             Node slow = head;
//             Node fast = head;

//             int cnt = 0;
//             while(cnt <= position){
//                 fast = fast.next;
//                 cnt++;
//             }

//             while(fast.next != null){
//                 slow = slow.next;
//                 fast = fast.next;
//             }
            
//             slow.next = slow.next.next;
//         }

//         void print(){
//             Node temp = head;

//             while(temp != null){
//                 System.out.print(temp.data+" ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//            linkedlist li = new linkedlist();

//            li.insertAtHead(23);
//            li.insertAtHead(34);
//            li.insertAtTail(54);
//            li.insertAtTail(90);
//            li.insertAtPosition(45,2);
//            li.insertAtPosition(89,4);
//            li.print();
//            li.delete(3);
//            li.print();

//     }
// }

public class LinkedList_java1{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    
    static Node intersection(Node head1,Node head2,int len){
        int count = 0;
        
        Node temp = head1;
        Node temp1 = head2;
        while(count < len){
            temp = temp.next;
            count++;
        }
        
      //  System.out.print(temp.data);
        while(temp.data != temp1.data){
            temp = temp.next;
            temp1 = temp1.next;
        }

        return temp;
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;

    Node insertAtHead(int val){
        Node temp = new Node(val);

        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        return head;
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

    void insertAtPosition(int position,int val){
        Node temp = head;

        int cnt = 0;
        while(cnt < position){
            temp = temp.next;
            cnt++;
        }

        Node temp1 = new Node(val);
        temp1.next = temp.next;
        temp.next = temp1;
    }

    int length(){
         Node temp = head;

         int len = 0;
         while(temp != null){
           len++;
           temp = temp.next;
         }
         return len;
    }

    void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
 }
  
 public static void main(String args[]){
    linkedlist l1 = new linkedlist();
    linkedlist l2 = new linkedlist();

    l1.insertAtHead(90);
    l1.insertAtHead(23);
    Node temp = l1.insertAtHead(24);
    l1.insertAtTail(43);
    l1.insertAtTail(34);
    l1.insertAtTail(33);
    l1.insertAtPosition(2,493);

    l2.insertAtHead(232);
    Node temp1 = l2.insertAtHead(343);
    l2.insertAtTail(43);
    l2.insertAtTail(34);
    l2.insertAtTail(33);
    l1.print();
    l2.print();

    int length = l1.length() - l2.length();
    Node inter = intersection(temp,temp1,length);
    System.out.print(inter.data);
 }
   
}
