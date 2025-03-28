
//Number of Sticks
// import java.util.*;

// public class Practise7 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();

//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int count = 0;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] == k) {
//                     count++;
//                     arr[i] = 0;
//                 } else if (arr[j] == k) {
//                     count++;
//                     arr[j] = 0;
//                 } else if ((arr[i] + arr[j]) == k)
//                     count++;
//             }
//         }
//         System.out.print(count);
//         sc.close();

//     }
// }

// Selection Sort
// import java.util.Scanner;
// public class Practise7 {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int arr[]=new int[n];
// for(int i=0;i<n;i++){
// arr[i]=sc.nextInt();
// }
// int i;
// for(i=0;i<arr.length-1;i++){
// for(int j=i+1;j<arr.length;j++){
// if(arr[i]>arr[j]){
// int temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
// }
// }
// }
// for(int i1=0;i1<n;i1++){
// System.out.print(arr[i1]+" ");}
// }

// }

// import java.util.*;


// class prime{
//     public int prime(int a){
//         for(int i=2;i<a;i++){
//            if(a % i == 0){
//             return 0;
//            }
//         }
//         return 1;
//     }
// }

// public class Practise7 extends prime{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// prime obj = new prime();

// int n = sc.nextInt();
// while(n > 0){
//       int a = sc.nextInt();
//       int b = a;
//       int i = 0,sum = 0;
//       int res = 0;

// for(int j =2;j<=b;j++){
//    if(b % j == 0) res = obj.prime(b);
   
//    int t = j;
//    System.out.print(res);

//    if(res == 1){
//      while(t > 0){
//         sum += t%10;
//         t /= 10;
//      }
//    }

// }
// //if(sum == a) System.out.println("Smith Number");
// //else System.out.println("Not a Smith Number");
// n--;
// }
// }
// }


import java.util.*;
import java.lang.*;

public class Practise7{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      int n =  sc.nextInt();
      int arr[] = new int[n];
      Integer[] arr1;
      for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();
         arr1[i] = arr[i];
      }
      
      Arrays.sort(arr1);
      for(int i=n-1;i>=0;i--){
         int a = Arrays.asList(arr).indexOf(arr1[i]);
         System.out.print(a+" ");
         
      }

      }


      
   }

