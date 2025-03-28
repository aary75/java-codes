package OOPSinJAVA;

public class class1 {

    public static class Student{
        String name;
        int roll;
        double percent;

    }
    public static void main(String args[]){
        Student s1 = new Student();

        s1.name= "Aaryan";
        s1.roll = 90;
        s1.percent = 98.7;
        System.out.println(s1.name+" "+s1.roll+" "+s1.percent);
    }
}

// package example;
 
// // Class
// public class class1 {
 
//     public void show()
//     {
//         System.out.println("Hello geeks!! How are you?");
//     }
 
//     public static void main(String args[])
//     {
//         class1 obj = new class1();
//         obj.show();
//     }
// }
