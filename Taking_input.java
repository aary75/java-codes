import java.util.Scanner;


public class Taking_input {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Length of rectangle is ");
        int length = myObj.nextInt();

        System.out.print("Breadth of rectangle is ");
        int breadth = myObj.nextInt();

        
        System.out.print("Area of rectangle is ");
        System.out.println(length * breadth);

        System.out.print("Perimeter of rectangle is ");
        System.out.println(2 * (length + breadth));

        System.out.print("Radius of circle is ");
        int radius1 = myObj.nextInt();

        double decimal = 4 * 3.14 * radius1 * radius1;
        System.out.format("Double Number: %.2f",decimal);
        myObj.close();

    }
}
