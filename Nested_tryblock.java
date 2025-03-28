public class Nested_tryblock {
    public static void main(String args[]){
        // we put most tricky code in nested try block 
        // and less tricky code outside the try block
        try{
            try{
                int[] a = {10,20,30,40};
                System.out.println(a[5]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of range");
            }
            System.out.println(10/0);
        }
        catch(ArithmeticException a1){
              System.out.println(a1);
        }
        System.out.println("Learn Coding");
    }
}
