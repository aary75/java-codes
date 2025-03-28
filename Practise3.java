//import java.util.Scanner;

//Reverse of a number,sum of its digits and count its digits
// public class Practise3 {
//     public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();

//       int count = 0,sum = 0,rev = 0;
//       while(a > 0){
//         int digit = a%10;
//         sum += a%10;
//         rev = rev*10 + digit; 
//         count++;
//         a /= 10;
//       }
//       System.out.println("Sum of digits is "+sum);
//       System.out.println("Number of zeroes is "+count);
//       System.out.println("Reverse of Number is "+ rev);
//       sc.close();
//     }
// }

// public class Practise3 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         int sum = 0,pro = 1;
//         System.out.println("First " + n + "factorial numbers are ");
//         for(int i=1;i<=n;i++){
//             pro *= i;
//             System.out.print(pro +" ");
//             if(i%2 == 0){
//                 sum -= i;
//             }
//             else{
//                 sum += i;
//             }
//         }
//         System.out.println();
//         System.out.println("Sum of the series is "+sum);


//         int a= sc.nextInt();
//         int b = sc.nextInt();
//         int ans = (int)Math.pow(a,b);
//         System.out.println(ans);
//         sc.close();
//     }
// }

class square{
    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

public class Practise3{
    public static void main(String args[]){
      square sq = new square();
      sq.side = 4;
      System.out.println(sq.area());
      System.out.println(sq.perimeter());

    }
}