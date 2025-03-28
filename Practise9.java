//Question 5-: Print all substrings
// import java.util.*;

// public class Practise9 {
//      public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();

//         for(int i=0;i<str.length();i++){
//             for(int j=i+1;j<str.length()+1;j++){
//                 System.out.println(str.substring(i,j));
//             }
//         }
//      }    
// }

//Question 6-: Rotate String
// import java.util.*;

// public class Practise9{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();

//         int n = sc.nextInt();
//         System.out.print(str.substring(str.length()-n,str.length()));
//         System.out.print(str.substring(0,str.length()-n));
//     }
// }

//Question 7-: Remove a character
// import java.util.*;

// public class Practise9{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();

       
//        // System.out.print(str.charAt(0));
//         for(int i=0;i<str.length()-1;i++){
//             if(str.charAt(i) != str.charAt(i+1)){
//                 System.out.print(str.charAt(i));
//             }
//         }
//         System.out.print(str.charAt(str.length()-1));
//     }
// }

//Question 8-: Highest Occuring character
// import java.util.*;

// public class Practise9{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         char[] str = sc.next().toCharArray();

//         int[] count = new int[256];
//         for(int i=0;i<str.length;i++){
//             count[str[i]]++;
//         }

//         int max = -1;
//         char ch = ' ';

//         for(int i = 0;i<str.length;i++){
//            if(max < count[str[i]]){
//             max = count[str[i]];
//             ch = str[i];
//            }
//         }
//         System.out.println(ch);
//     }
// }

