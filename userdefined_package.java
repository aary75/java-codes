package aaryan;

//default access modifier
// public class userdefined_package
// {

//     void add ()
//   {
//     System.out.println ("Learn Coding..!");
//   }
// }

//  class B{
//   public static void main (String[]args)
//   {
//     userdefined_package obj = new userdefined_package();
//     obj.add ();
//   }
// }

//private access modifier
//public class userdefined_package
// {

//    private void add ()
//   {
//     System.out.println ("Learn Coding..!");
//   }
// }

//  class B{
//   public static void main (String[]args)
//   {
//     userdefined_package obj = new userdefined_package();
//     obj.add ();  It will show error here
//   }
// }

//protected access modifier
public class userdefined_package{
    
    protected void add(){
        System.out.println("Learn Coding..!");
    }
}

class B extends userdefined_package{
    public static void main(String[] args){
        B obj = new B();
        obj.add();
    }
}

//a outside is also created in second_user.java file in whick ankush package is declared
// to use protected add() function in ankush visit second_user.java file
// to execute this function, we have to write 
// javac -d . userdefined_package.java
// javac -d . second_user.java
// java ankush.second_user 
// in second_user file


//to use public access modifier we just import package into another package