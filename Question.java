import java.util.Scanner;

 class Question {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Dice number ");
        int dice = myObj.nextInt();

        if(dice == 6){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        myObj.close();

       // System.out.println(args[0]);

        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
      //  final variable, run function(methods), extends keyword, static variable(very important)
      //  
    }

}
