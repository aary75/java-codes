import java.util.Scanner;
public class overload{
    
        public int sum(int a,int b){
            return a+b;
        }
        public int sum(int a,int b,int c){
            return (a+b+c);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            

            overload s1=new overload();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("sum of two no is:"+s1.sum(a,b));
            System.out.println("sum of three no is:"+s1.sum(a,b,c));

        }
    }
