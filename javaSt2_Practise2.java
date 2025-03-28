// Question 1-: Palindrome string
// import java.util.*;
// public class javaSt2_Practise2 {
//     public static void main(String args[]){
//         Scanner obj = new Scanner(System.in);

//         StringBuilder str = new StringBuilder(obj.nextLine());
//         String sc = str +"";
//         String sc1 = str.reverse() +"";

//         //System.out.println(sc1);
//         if(sc.equals(sc1)) System.out.println("true");
//         else System.out.println("false");
//         obj.close();
//     }
// }

//Question 2-: Replace character

// import java.util.*;
// public class javaSt2_Practise2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         char ch = sc.next().charAt(0);
//         char ch1 = sc.next().charAt(0);

//         System.out.println(str.replace(ch,ch1));
//     }
// }

//Question 4-: Uppercase to Lowercase
import java.util.*;

public class javaSt2_Practise2{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        String str = obj.nextLine();
        for(int i=0;i<str.length();i++){
            if((str.charAt(i) >='a' && str.charAt(i) <='z') || (str.charAt(i) >='A' && str.charAt(i) <='Z')){
            char ch = str.charAt(i);
            int a = (int)ch;
            a += 32;
            char ch1 = (char)a;
            System.out.print(ch1);
        }
        else System.out.print(str.charAt(i));
    }
    }
}