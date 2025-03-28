class A extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=0;i<5;i++){
            System.out.println(n);
        }
    }
}
public class Stop_method {
    public static void main(String args[]){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
  
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");

        t1.start();
        t2.start();
        t3.start();
     //   t2.stop();

    }
}
