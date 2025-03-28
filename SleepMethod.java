//you cannot override exception in thread 
class A extends Thread{
    public void run(){

        try{
        String n = Thread.currentThread().getName();
        for(int i=0;i<5;i++){
            System.out.println(n);
            Thread.sleep(1000);
        }}
        catch(InterruptedException e){
            
        }
    }
}

public class SleepMethod {
    public static void main(String args[]) throws InterruptedException{

        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        for(int i=0;i<5;i++){
            System.out.println("Data outside the thread");
            Thread.sleep(1000);
        }
    }
}
