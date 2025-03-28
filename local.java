public class local {
     
    class A {
        
    }
    public static void main(String[] args) {
        int a = 5;  // global 
             
        for(int i=0;i<5;i++){
            int a1 = 6;  // local
            System.out.print(a1);
        }
        System.out.print(a);
        System.out.print(a1);
    }
}
