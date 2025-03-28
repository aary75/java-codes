class Multi extends Thread{
     public void run(){
      try{
        for(int i=0;i<5;i++){
            System.out.println("Aaryan");
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e){
        System.out.println("Exception");
    }
     }
}
//in multitreading we cannot predict sequence of output
//It will always give random sequence of output

// Smile string execution is responsibility of main thread and Aaryan string exection is 
// responsibility of t1 thread

//Exception in thread cannot be handle by throws(except main method), it will done by try 
//and catch method
public class Threadclass{
    public static void main(String args[]) throws InterruptedException {
         Multi t1 = new Multi();
         t1.start();
    

    for(int i=0;i<5;i++){
        System.out.println("Smile");
        Thread.sleep(1000);
    }
}
}