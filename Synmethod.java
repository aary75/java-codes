// class Table{
//     public synchronized void printable(int n){
//     for(int i=1;i<=10;i++){
//         System.out.println(n*i);
//     }
// }}

// class thread1 extends Thread{
//     Table t;
//     thread1(Table t){
//         this.t = t;
//     }
//     public synchronized void run(){
//         t.printable(5);
//     }
// }

// class thread2 extends Thread{
//     Table t;
//     thread2(Table t){
//         this.t = t;
//     }
//     public synchronized void run(){
//         t.printable(6);
//     }
// }

// public class Synmethod {
//     public static void main(String args[]){
//        Table t = new Table();

//        thread1 t1 = new thread1(t);
//        thread2 t2 = new thread2(t);

//        t1.start();
//        t2.start();
//     }
// }

class Table{
    public synchronized void printable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}

class thread1 extends Thread{
    Table t;
    thread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printable(5);
    }
}

class thread2 extends Thread{
    Table t;
    thread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printable(7);
    }
}


public class Synmethod{
    public static void main(String args[]){
       Table t = new Table();

       thread1 t1 = new thread1(t);
       thread2 t2 = new thread2(t);

       t1.start();
       t2.start();
    }
}