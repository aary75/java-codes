class Bus extends Thread{
    int available = 4,passenger;
    Bus(int passenger){
        this.passenger  = passenger;
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(available>=passenger){
            System.out.println(name+" Seat Reserved..!");
            available--;
        }
        else{
            System.out.println(name +",Seat not available..");
        }
    }
}

public class AvailableSeat {
    public static void main(String args[]){
        Bus b = new Bus(1);
        
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);
        Thread t4 = new Thread(b);
        Thread t5 = new Thread(b);

        t1.setName("Shri Ram");
        t2.setName("Raj");
        t3.setName("Mukul");
        t4.setName("Shyam");
        t5.setName("Shri Krishna");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
