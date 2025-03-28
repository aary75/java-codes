import java.util.Scanner;
abstract class Animal{
    abstract void name();
    Scanner obj = new Scanner(System.in);
    int length = obj.nextInt();
    int breadth = obj.nextInt();
    int area= length*breadth;

}

public class Abstraction_class extends Animal{
    void name(){System.out.println("Length of rectangle is "+ length);
                System.out.println("Breadth of reactangle is "+ breadth);
                System.out.println("Area of rectangle is "+area);}
    public static void main(String[] args){
        Abstraction_class sc = new Abstraction_class();
        sc.name();

    }
}
