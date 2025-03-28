import java.util.Scanner;

// public class Pattern {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j =1;j<=c;j++){
//                 if(i == 1 ||j==1 ||j==c||i == r) System.out.print("*");
//                 else System.out.print(" ");
//         }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// public class Pattern{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         for(int i =1;i<=n;i++){
//             for(int j = i;j<=n;j++){
//                 System.out.print(j);
//             }
//             for(int k = 1;k<=i-1;k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

public class Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        // for(int i=1;i<=r;i++){
        //    if(i%2 == 0) a= 2;
        //    else a = 1;
        //    int n = a;
        //    for(int j = 1;j<=c;j++){
        //     if(n == 1) System.out.print(n++);
        //     else if(n == 2) System.out.print(n--);
        //    }
        //    System.out.println();
        // }

        for(int i=1;i<=r;i++){
            for(int j =1;j<=c;j++){
                if((i + j)%2 == 0){
                    System.out.print(1);
                }
                else System.out.print(2);
            }
            System.out.println();
        }
        sc.close();
    }

}
