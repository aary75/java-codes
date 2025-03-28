public class LinkedList_secondType {
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

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
            tail.next = temp;
            temp = tail;
        }}

        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
            temp.next = head;
            temp = head;
        }}


    }
    public static void main(String args[]){
       linkedlist li = new linkedlist();
       li.insertAtEnd(89);
       li.insertAtEnd(90);
       li.insertAtStart(34);
    }
}
