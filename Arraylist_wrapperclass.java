import java.lang.Integer;
import java.util.ArrayList;
public class Arraylist_wrapperclass {
    public static void main(String args[]){
        //wrapper class is used to change primitive data type into object
        Integer a = Integer.valueOf(4);
        Float j = Float.valueOf(4.5f);
        System.out.println(j);

        ArrayList<Integer> l1 = new ArrayList<Integer>();

        //append elements in arraylist
        l1.add(9);
        l1.add(3);
        l1.add(2);
        l1.add(4);
        l1.add(9);

        //get element at particular index
        System.out.println(l1.get(0));

        //get arraylist elements by index
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
       System.out.println();

        //printing the array list directly
        System.out.println(l1);

        //Add elements at any index
        l1.add(1,100);
        System.out.println(l1);

        //change value of element
        l1.set(1,10);
        System.out.println(l1);

        //remove elements from given index
        l1.remove(1);
        System.out.println(l1);

        //remove elements without index
        //remove method delete first occurance of element
        //if we pass a value that does not exist in list, then it will not give any output
        //but if we prints it then it will give boolean output
        l1.remove(Integer.valueOf(9));
        System.out.println(l1);
        

        //check whether an element lies in list or not
        boolean ans = l1.contains(Integer.valueOf(4));
        System.out.println(ans);

        //if we does not pass any data type then we can pass any in list
        ArrayList l2 = new ArrayList();
        l2.add(9);
        l2.add("String");
        l2.add('D');
        l2.add(true);

        System.out.println(l2);


    }
}
