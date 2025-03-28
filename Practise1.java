import java.util.Scanner;


public class Practise1 {
    public static void main(String args[]){
         Scanner myObj = new Scanner(System.in);
         int n = myObj.nextInt();

        while(n>0){
        int age = myObj.nextInt();
         if(age >= 18){
            System.out.println("Eligible for Exam");
         }
         else{
            System.out.println("Not Eligible for Exam");
         }
        n--;}
         myObj.close();
    }
}
