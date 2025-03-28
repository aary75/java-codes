  import java.util.Scanner;

 // public class Practice4 {
 //     public static void main(String args[]){
 //         Scanner sc = new Scanner(System.in);
 //         int bill = 0;
 //         String order =" ";
 //         boolean stop = true;
  //         int order1 = 0;
 //         for(;stop != false;){

 //          order = sc.next();
 //            if(order.equals("burger")){
 //             bill += 50;
 //             order1++;
 //            }
 //            else if(order.equals("tea")){
 //             bill+= 20;
 //             order1++;
 //            }
 //            else if(order.equals("done")){
 //             System.out.print("You have ordered "+ order1+" items ");
 //             System.out.println("and this is your "+bill);
 //             stop = false;
 //            }
           
 //         }
 //     }
 // }

// // public class Practice4 {
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);

// //         int n = sc.nextInt();
// //        int arr[] = new int[n];
       
// //        for(int i=0;i<n;i++){
// //         arr[i] = sc.nextInt();
// //        }

// //         int target = sc.nextInt();

// //         for(int i =0;i<n-1;i++){
// //             for(int j =i+1;j<n;j++){
// //                 if(arr[i] + arr[j] == target) System.out.println("["+i+","+j+"]");
// //             }
// //         }
// //         sc.close();
// //     }
// // }

// public class Practice4 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         int k = sc.nextInt();
//         int a = 0;
//         int arr1[] = new int[n];
//         for(int i = k+1;i<n;i++){
//             arr1[a] = arr[i];
//             a++;
//         }

//         for(int i =0;i<=k;i++){
//             arr1[a] = arr[i];
//             a++;
//         }
        
//         System.out.print("[");
//         for(int i=0;i<a-1;i++){
//             System.out.print(arr1[i]+",");
//         }
//         System.out.print(arr1[a-1]);
//         System.out.print("]");
//     }
// }

public class Practice4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int sum1 =0;
        for(int i=1;i<=n;i++){
            sum += i;
        }

        for(int i=0;i<n-1;i++){
            sum1+= arr[i];
        }
        System.out.println(sum-sum1);
        sc.close();
    }
}