class A extends Thread{
    public void run(){
       // String n = Thread.currentThread().getName();
    System.out.println("IsAlive method program");
    }
}

public class IsAlive {
    public static void main(String args[]){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        // t1.setName("thread 1");
        // t2.setName("thread 2");
        // t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
