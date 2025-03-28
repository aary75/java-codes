//remove duplicate from sorted linked list
// public class LinkedList_java4 {
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

//     void insertAtPosition(int position,int val){
//         Node temp = head;

//         int cnt = 1;
//         while(cnt < position - 1){
//             temp = temp.next;
//             cnt++;
//         }

//         Node temp1 = new Node(val);
//         temp1.next = temp.next;
//         temp.next = temp1;
//     }

//     int length(){
//         Node temp = head;

//         int len = 0;
//         while(temp != null){
//             len++;
//             temp = temp.next;
//         }
//         return len;
//     }

//     void sort(int length){
//         Node temp = head;

//         for(int i=0;i<length-1;i++){
//             for(int j=0;j<length-1;j++){
//                 if(temp.data > temp.next.data){
//                     int d = temp.data;
//                     temp.data = temp.next.data; 
//                     temp.next.data = d;
//                 }
//                 temp = temp.next;
//             }
//             temp = head;
        
//         }
//     }
//     void print(){
//         Node temp = head;

//         while(temp.next != null){
//             if(temp.data != temp.next.data){
//             System.out.print(temp.data+" ");
//             }
//             temp = temp.next;
//     }
//         System.out.print(temp.data+" ");
//         System.out.println();
//     }

//     public static void main(String args[]){
//         linkedlist li = new linkedlist();

//         li.insertAtHead(90);
//         li.insertAtHead(90);
//         li.insertAtHead(45);
//         li.insertAtTail(45);
//         li.insertAtTail(232);
//         li.insertAtTail(232);
//         li.insertAtPosition(2,305);
//         li.insertAtPosition(3,305);
//         int length = li.length();
//         li.sort(length);
//         li.print();
//     }
//     }
// }


//reverse a linked list

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class LinkedList_java4{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
       static Node head = null;
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
    
    static Node t = head;
    public static Node reverse(){
           if(t.next == null) return null;
           Node newHead = reverse(t.next);
           t.next.next = t;
           t.next = null;
           return newHead;
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
        linkedlist li = new linkedlist();

        li.insertAtHead(90);
        li.insertAtHead(32);
        li.insertAtHead(43);
        li.insertAtTail(454);
        li.insertAtTail(23);
        li.insertAtTail(21);
        Node a = li.reverse();
        li.print();
    }
}