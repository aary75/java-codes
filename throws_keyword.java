public class throws_keyword {

    void div(int a,int b) throws ArithmeticException
{
   if(b==0){
    throw new ArithmeticException();
   }
   else{
    int c = a/b;
    System.out.println(c);
   }
}


public static void main(String args[]) throws ArithmeticException {
    throws_keyword t = new throws_keyword();
    try{
        t.div(20,0);
    }
    catch(Exception e){
        System.out.println("");
    }

    System.out.println("The value of b is zero");
}
    // public static void main(String args[]) throws InterruptedException{
    //     for(int i=0;i<5;i++){
    //         System.out.println(i);
    //         Thread.sleep(1000);
    //     }
    // }
}
