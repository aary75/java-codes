class Multi implements Runnable{
    public void run(){
        System.out.println("Thread");
    }
}
public class ImplementReference {
    public static void main(String args[]){
    Multi obj = new Multi();
    Thread sc = new Thread(obj);
    sc.start();

    for(int i=0;i<5;i++){
        System.out.println("Data outside the user thread");
    }
}
}