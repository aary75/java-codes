import java.lang.String;
// public class Overloading {

//     public static void display(int a){
//         System.out.println(a);
//         System.out.println("Get Integer Object");
//     }
//     private static void display(String a){
//         System.out.println(a);
//         System.out.println("Get String object");
//     }
//     public static void main(String args[]){
//         display(24);
//         display("Hello");
//     }
// }

class HelperService{
    private static String format(int value){
        return String.format("%d",value);
    } 

    private static String format(double value){
        return String.format("%.3f",value);
    }

    private static String format(String value){
        return String.format("%.3f",Double.parseDouble(value));
    }


public static void main(String args[]){
    HelperService hs = new HelperService();
    System.out.println(hs.format(9));
    System.out.println(hs.format(89.4323));
    System.out.println(hs.format("hello"));
}
}