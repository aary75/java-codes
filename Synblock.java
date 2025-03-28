class table{
    public void show(String name){

        synchronized(this){
            System.out.println("How are U "+name);
        } 
    }
}

class thread1 extends Thread{
    table t;
    String name;

    thread1(table t,String name){
        this.t = t;
        this.name  = name;
    }

    public void run(){
        t.show(name);
    }
}
public class Synblock {
    public static void main(String args[]){
     table t = new table();
     table obj = new table();
     
     thread1 t1 = new thread1(t,"Mukul");
     thread1 t2 = new thread1(t,"Raj");
     thread1 t3 = new thread1(obj,"Adnan");
     thread1 t4 = new thread1(obj,"Shakti");
     
     t1.start();
     t2.start();
     t3.start();
     t4.start();

    }
}
