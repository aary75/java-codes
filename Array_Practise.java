import java.util.*;

// public class Array_Practise {
//    public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
   
//    int n = sc.nextInt();
//    int arr[] = new int[n];
//    for(int i=0;i<arr.length;i++){
//     arr[i] = sc.nextInt();
//    }    
//    Arrays.sort(arr);
// //    for(int num : arr){
// //     System.out.print(num);
// //    }

//    double sum =0;
//    for(int i1=1;i1<arr.length-1;i1++){
//     sum+= arr[i1];
//    }
//    double a = sum/(arr.length-2);
//    System.out.format("%.1f",a);
//    sc.close();
//    }

// }
class swap{
    String color1;
    String color2;
   public void swap(Array_Practise c2,Array_Practise c1){
    String temp = c1.color1;
    c1.color1 = c2.color2;
    c1.color2 = temp;
  //  System.out.print(c1+" "+c2);
   }
}

public class Array_Practise extends swap{
    public static void main(String args[]){
      Array_Practise obj = new Array_Practise();
      obj.color1 = "Red";
      obj.color2 = "Blue";
      System.out.println(obj.color1+" "+obj.color2);
      obj.swap(obj,obj);

      System.out.println(obj.color1+" " +obj.color2);
     
    } 
}
