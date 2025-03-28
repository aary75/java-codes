// check whether a character lies in string or not 
// give index of character in string
// import java.util.*;
// public class javaSt2_Practise {
//     public static void main(String args[]){
//            Scanner sc = new Scanner(System.in);
//            String str = sc.nextLine();
//            char ch = sc.next().charAt(0);

//    for(int i=0;i<str.length();i++){
//     if(str.charAt(i) == ch){
//         System.out.println("KLj");
//     }
//    }
//            System.out.println(str.indexOf(ch));
//     }
// }

//Question 3-: Replace a character

// import java.util.*;
// public class javaSt2_Practise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         char ch = sc.next().charAt(0);
//         char ch1 = sc.next().charAt(0);

//         System.out.println(str.substring(0,str.indexOf(ch)) + ch1+str.substring(str.indexOf(ch)+1));
//     }
// }

// Question 4 remove all white space 
// import java.util.*;

// public class javaSt2_Practise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         StringBuilder str1 = new StringBuilder("");
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i) != ' '){
//                 str1.append(str.charAt(i));
//             }
//         }
//         System.out.print(str1);
//         sc.close();
//     }
// }

//Question 5-: Check whether a string in palindrome or not
// import java.util.*;
// public class javaSt2_Practise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         StringBuilder str = new StringBuilder(sc.nextLine());
//         String s1 = str +"";
//         StringBuilder str1 = new StringBuilder(str.reverse());
//         String obj = str1 +"";

//         str.equals(str1);
//         if(s1.equals(obj)){
//             System.out.println("String is a palindrome string");
//         }
//         else{
//             System.out.println("String is not palindrome string");
//         }
//     }
// }

//Question 6-: Check whether two strings are anagram or not
// import java.util.*;
// public class javaSt2_Practise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         String str1 = sc.nextLine();

//         char[] arr = str.toCharArray();
//         char[] arr1 = str1.toCharArray();

//         Arrays.sort(arr);
//         Arrays.sort(arr1);
//         if(Arrays.equals(arr,arr1)){
//             System.out.println("Both strings are anagram of each other");
//         }
//         else{
//             System.out.println("Both strings are not anagram of each other");
//         }
//         sc.close();
//     }
// }

//Question 7-: Revese a String
// import java.util.*;
// public class javaSt2_Practise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         StringTokenizer str1 = new StringTokenizer(str," ");
//         StringBuilder str2 = new StringBuilder(str);
//         while(str1.hasMoreTokens()){
//             System.out.print(str1.nextToken()+" ");
//         }
//         System.out.println();
//         System.out.println(str2.reverse());
//         sc.close();
//     }
// }

//Question 8-: First non-repeated character in string
// import java.util.*;

// public class javaSt2_Practise {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         char[] str = sc.next().toCharArray();

//         for(int i =0;i<str.length;i++){
//             int count =0;
//             for(int j =0;j<str.length;j++){
//                 if(str[i] == str[j] && j != i) count = 1;
//             }

//             if(count == 0){
//               System.out.println(str[i]);
//               break;
//             }
//         }

//     }
// }


//Question 9-: Remove all vowels
import java.util.*;

public class javaSt2_Practise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str.replaceAll("[aeiouAEIOU]",""));
    }
}