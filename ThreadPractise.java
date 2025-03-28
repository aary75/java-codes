class Multi extends Thread{
    public void run(){
        try{
            System.out.println("fladka");
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("dfa");
        }
    }
}

public class ThreadPractise {
    public static void main(String args[]) throws InterruptedException{
        Multi t1 = new Multi();
        t1.start();

        for(int i=0;i<5;i++){
            System.out.println("klsad");
            Thread.sleep(2000);
        }
    }
}
