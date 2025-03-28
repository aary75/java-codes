public class multipletryblock {
    public static void main(String args[]){
    try{
        int a = 10,b = 0,c;
        c = a/b;
        System.out.println("C can be printed");
    }
    catch(ArithmeticException e){
        System.out.println("c cannot be printed");
    }

    try{
        int[] a= {2,3,4,5};
        System.out.println(a[5]);
    }
    catch(ArrayIndexOutOfBoundsException e1){
       System.out.println("this index is not in array");
    }
}
}