import java.util.Scanner;
import java.util.*;
public class LinkedList_practise {

    public static int length1(Node head){
        if(head == null) return 0;
        return 1+length1(head.next);
    }

    public static void length2(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        System.out.print(count);
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }
    }

    public static void push(Node head,int data){

        Node new_node = new Node(data);
        new_node.next = head;
        new_node = head;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         Node n1 = new Node(90);
        Node n2 = new Node(89);
        Node n3 = new Node(88);
        Node n4 = new Node(87);
        Node n5 = new Node(86);
        Node n6 = new Node(85);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        int a = length1(n1);
        System.out.print(a);
        
        length2(n1);

    }
}
