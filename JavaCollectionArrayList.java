import java.util.ArrayList;

public class JavaCollectionArrayList {
    public static void main(String args[]){
        ArrayList<String> str = new ArrayList<String>();

        //ArrayList.add(string) is used to add string in last 
        str.add("Anish");
        str.add("Raman");
        str.add("Pankaj");
        System.out.println(str);

        str.add("Rahul");
        System.out.println(str);

        //To add element at any index inn arraylist  we use ArrayList.add(index,string)
        str.add(3,"Aman");
        System.out.println(str);

        //To remove element Arraylist.remove(index);
        str.remove(1);
        System.out.println(str);

        //To replace a element we have to use ArrayList.set(index,new_string)
        str.set(0,"Rohit");
        System.out.println(str);

        //To print a special element 
        System.out.println(str.get(3));

        //To delete a singal element
        str.remove(1);
        System.out.println(str);
        
        //To delete all elements 
        str.clear();
        System.out.println(str);

    }
}
