import java.util.LinkedList;
public class JavaCollectionLinkedList {
    public static void main(String args[]){
        LinkedList<String> str = new LinkedList<String>();
        //To add elements
        str.add("Rahul");
        str.add("Nitish");
        str.add("Ankush");
        System.out.println(str);

        //LinkedList.add(string) is used to add elements in last
        //To add element in first of list, we use linkedlist.addFirst(string);
        str.addFirst("Pankaj");
        System.out.println(str);

        //To add element in middle of linked list, we use linkedlist.add(index,string)
        str.add(3,"Tushar");
        System.out.println(str);

        //remove and removeFirst both are used to delete elements at first position
        str.removeFirst();
        System.out.println(str);

        //  remove last element
        str.removeLast();
        System.out.println(str);

    }
}
