//  class logger{
//     String name;
//     private void message(){
//         System.out.println("This is a message");
//     }

// }

// public class Classes extends logger {
//     public static void main(String args[]){
//       //  logger sc = new logger();
//       Classes sc = new Classes();
//         sc.name = "Aaryan";
//         System.out.println(sc.name);
//       //  sc.message();
//        }
// }

public class Classes{
  final int a= 45;

  public static void main(String args[]){
    Classes obj = new Classes();
    obj.a = 34;
    System.out.println(obj.a);
  }
}