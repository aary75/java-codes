
class thread1 extends Thread{
    static int withdraw;
    static int bal = 5000;

    thread1(int withdraw){
        this.withdraw = withdraw;
    }

    public static synchronized void withdraw(){
        String name = Thread.currentThread().getName();
        if(bal >= withdraw){
            System.out.println("Balance withdraw by "+ name);
            System.out.println(bal+" "+withdraw);
            bal = bal - withdraw;
        }
        else{
            System.out.println("Insufficient Balance");
            System.out.println(bal +" "+withdraw);
        }
    }

    public void run(){
        withdraw();
    }
}
public class staticsyn {
    public static void main(String args[]){
        thread1 t = new thread1(5000);
       

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
       
        t1.setName("Rahul");
        t2.setName("Aaryan");
        t1.start();
        t2.start();

        thread1 obj = new thread1(7000);
        Thread t3 = new Thread(obj);
        Thread t4 = new Thread(obj);
        t3.setName("Ansh");
        t4.setName("Loven");
        t3.start();
        t4.start();

     }
}
