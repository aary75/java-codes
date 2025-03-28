//package LinkedList;

public class Linked_List {

    //Insert node at the end of linked list
    public static void insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
        while(temp.next != null){
            t = t.next;
        }
        t.next = temp;
    }

   // Recursive call
    public static void recursive(Node head){
        if(head == null) return ;
        System.out.print(head.data+" ");
        recursive(head.next);
    }

    //Reversing to list
    public static void recursive_rev(Node head){
        if(head == null) return;
        recursive_rev(head.next);
        System.out.print(head.data+" ");
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static class Node{
        int data;
        Node next;
        //data type of next is Node
        Node(int d){
            this.data = d;
        }
    }
    public static void main(String[] args){
     /*benefit of linked list is to that it is not necessary that all elements have same
    address*/
    /*limitation is that to fetch any element from linked list the time complexity is O(n)*/
         
          Node n1 = new Node(9);
          System.out.println(n1.next);
          Node n2 = new Node(3);
          Node n3 = new Node(8);
          Node n4 = new Node(0);
          Node n5 = new Node(7);
          //Till all nodes are not connected n1 n2 n3 n4 n5
         
          n1.next = n2;  //But now n1 is connect to n2  n1 -> n2 n3 n4 n5
          System.out.println(n1.next); //it will give address of n2
          System.out.println(n2);
          System.out.println(n2.data);       
          System.out.println(n1.next.data);  /*n2.data and n1.next.data will give same answer
                                             because n1 and n2 are connected*/
          
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        //Insertion of node in list
        Node n6 = new Node(19);
        n2.next = n6;
        n6.next = n3;
        System.out.println(n2.next.data);
        System.out.println(n6.data);

        //Displaying complete linked list
        System.out.println(n1.data);
        System.out.println(n1.next.data);  //for n2 node 
        System.out.println(n1.next.next.data);  //for n3 node 
        System.out.println(n1.next.next.next.data);  //for n4 node 
        System.out.println(n1.next.next.next.next.data);  //for n5 node 
        System.out.println(n1.next.next.next.next.next.data); // for n6 node

        //better way to display complete node
        // Node temp = n1;
        // while(temp != null){
        //     System.out.print(temp.data +" ");
        //     temp = temp.next;
        // }
        display(n1);
        System.out.println();
        recursive(n1);
        System.out.println();
        recursive_rev(n1);

        insertAtEnd(n1,89);
        recursive_rev(n1);
     //   System.out.println(n5.next.data);



    }
}
