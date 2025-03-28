import javax.crypto.spec.GCMParameterSpec;

public class multiple_catchblock {
    public static void main(String args[]){
        try{
            int a = 10,b = 0,c;
            c = a/2;
            System.out.println(c);

            int[] arr = {1,2,3,4,5};
            System.out.print(arr[5]);

            String str = null;
            System.out.println(str.toUpperCase());
        }

        //In multiple catch block, the Super class must be at the last block
        // If a particular declared lies and it also declared as a catch block then it will give output 
        // according to that block otherwise to the super class Exception
        catch(ArithmeticException a){
            System.out.println("Zero cannot be divided");
        }
        // catch(ArrayIndexOutOfBoundsException a1){
        //     System.out.println("Index beyond the range");
        // }
        catch(NullPointerException a2){
            System.out.println("Null operator cannot be uppercased");
        }
        catch(Exception e){
            System.out.println("There is exception lies");
        }
    }
}
