//delete a node when its position is given

// public class LinkedList_java {
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

//         void insertAtEnd(int val){
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

//         void insertAtPosition(int position,int val){
//             Node temp = head;
 
//             int cnt = 1;
//             while(cnt < position){
//                 temp = temp.next;
//                 cnt++;
//             }

//             Node temp1 = new Node(val);
//             temp1.next = temp.next;
//             temp.next = temp1; 
//         }

//         void delete1(int position1){
//              Node temp1 = head;

//              int cnt = 0;
//              while(cnt < position1-2){
//                 temp1 = temp1.next;
//                 cnt++;
//              }

//              temp1.next = null;
//         }

//         void delete(int position){
//             Node temp = head;


//             int cnt = 0;
//             while(cnt < position-1){
//                 temp = temp.next;
//                 cnt++;
//             }

//             if(temp.next == null){
//                delete1(position);
//             }
//             else{
//             temp.data = temp.next.data;
//             temp.next = temp.next.next;
//             }

//          //   System.out.println(temp.data);
//         }

//         void print(){
//            Node temp = head;
           
//            while(temp != null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//            }
//            System.out.println();
//         }
//     }


//     public static void main(String args[]){
//         linkedlist li = new linkedlist();

//         li.insertAtHead(90);
//         li.insertAtHead(89);
//         li.insertAtEnd(23);
//         li.insertAtPosition(1,45);
//         li.insertAtPosition(2,23);
//         li.insertAtPosition(3,43);
//         li.print();
//         System.out.println();
//         li.delete(4);
//         li.delete(5);
//         li.insertAtHead(34);
//         li.insertAtEnd(123);
//         li.insertAtPosition(4,3232);
//         li.print();
//         li.delete(3);
//         li.delete(2);
//         li.print();
//     }
// }


// Find nth node from end of the linked list
public class LinkedList_java{
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

    void insertAtPosition(int position,int val){
        Node temp = head;

        int cnt = 1;
        while(cnt < position - 1){
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
            temp = temp.next;
            len++;
        }
        return len;
    }

    void find(int position){
       Node temp = head;
       
       int len = length();
       int cnt = 0;
       while(cnt < len-position){
        temp = temp.next;
        cnt++;
       }

       System.out.println(temp.data);
    }


    void find1(int position){
        Node slow = head;
        Node fast = head;

        int cnt = 1;
        while(cnt <= position){
            fast = fast.next;
            cnt++;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(slow.data);
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
       li.insertAtHead(23);
       li.insertAtHead(89);
       li.insertAtTail(123);
       li.insertAtPosition(2,234);
       li.print(); 
       int len = li.length();
       System.out.println(len);

    //    li.find(3);
    //    li.find(4);
    //    li.find(1);
    //    li.find(2);

       li.find1(2);
       li.find1(3);

    }
}
