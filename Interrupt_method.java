//interrupt method only use in waiting state
class A extends Thread{
    public void run(){
        try{
        for(int i=0;i<5;i++){
            System.out.println("t1 thread running..");
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException i){
        System.out.println("Interrupted Exception");
    }
    }
}

public class Interrupt_method {
    public static void main(String args[]){
        A t1 = new A();

        t1.start();
        t1.interrupt();
    }
}
