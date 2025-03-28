class thread1 extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=0;i<5;i++){
            System.out.println(n);
        }
    }
}

class thread2 extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i=0;i<5;i++){
            System.out.println(name);
            Thread.yield();
        }
    }
}
public class yield_method {
    public static void main(String args[]){
       thread1 t1= new thread1();
       thread2 t2 = new thread2();

       t1.start();
       t2.start();
    }
}
