import java.util.Scanner;

// class Vehicle{
//     protected String brand = "Ford";
//     public void honk(){
//         System.out.println("Tuut, tuut!");
//     }
// }

// public class Practise5{
//    private String modelname = "Mustang";
//    public static void main(String args[]){
//       Vehicle myObj = new Vehicle();
//       Practise5 sc = new Practise5();

//       myObj.honk();
//       System.out.println(myObj.brand + " "+ sc.modelname);
//    }    
// }
class Rectangle{
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();

    int b = sc.nextInt();

    public void setDim(){
        int peri = 2*(l+b);
        System.out.println("Perimeter of rectangle is "+peri);
    }

    public void setArea(){
       int area = l*b;
       System.out.println("Area of rectangle is "+area);     
    }
}

public class Practise5 extends Rectangle{
    public static void main(String args[]){
        Practise5 myObj = new Practise5();
        myObj.setDim();
        myObj.setArea();
    }
}