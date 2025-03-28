//Question 2-: count substirng;
// import java.util.*;
// public class practisesheet3 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         String str1 = sc.next();

//         int count = 0;
//         for(int i= 0;i<str.length();i++){
//             for(int j = i+1;j<str.length()+1;j++){
//                 if(str.substring(i,j).equals(str1)){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

//Question 3-: concatenation of two strings and add a given string at a given index
// import java.util.*;

// public class practisesheet3{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         StringBuilder str = new StringBuilder(sc.nextLine());
//         StringBuilder str1 = new StringBuilder(sc.nextLine());

//         System.out.println(str.append(str1));
//         System.out.println(str.insert(4,"garg"));
//     }
// }

//Question 5-: Get index of firstoccurence of given string in main string
// import java.util.*;

// public class practisesheet3{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         String str1=  sc.nextLine();

//         for(int i=0;i<str.length();i++){
//             for(int j = i+2;j<str.length()+1;j++){
//                 if(str1.equals(str.substring(i,j))){
//                     System.out.println(i);
//                 }
//             }
//         }
//     }
// }

//Question 6-: Remove all even integers from given integer string
// import java.util.*;

// public class practisesheet3{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         for(int i=0;i<str.length();i++){
//             int a = (int)str.charAt(i);
//             if(a %2 != 0) System.out.print((char)a);
//         }
        
//     }
// }

//Question 7-: Find second largest element in integer String
// import java.util.*;

// public class practisesheet3{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         char[] ch = str.toCharArray();
//          Arrays.sort(ch);
//         String str1 = str.replace(ch[str.length()-1],' '); 

//     //System.out.println(str1);
//     char ch1 = ' ';
//     for(int i=1;i<str1.length();i++){
//         if(str1.charAt(i) > str1.charAt(i-1)){
//             ch1 = str1.charAt(i);
//         }
//     }
//     System.out.println(ch1);
//     }
// }

//Question 8-: Print frequency of all elements

import java.util.*;

public class practisesheet3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        char[] str = sc.next().toCharArray();
        Arrays.sort(str);

        StringBuilder str1 = new StringBuilder("");
        str1.append(str[0]);
        int count =1;

        for(int i=0;i<str.length-1;i++){
           if(str[i] == str[i+1]){
            count++;
           }   
           else{
            str1.append(count);
            str1.append(str[i+1]);
            count = 1;
           }
        }
        str1.append(count);
 System.out.println(str1);
    }
}