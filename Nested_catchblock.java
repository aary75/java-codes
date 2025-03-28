public class Nested_catchblock {
    public static void main(String args[]){
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
           try{
            String str = null;
            System.out.println(str.toLowerCase());
           }
           catch(NullPointerException e1){
            System.out.println("Null cannot be lowercase");
           }
        }
        System.out.println("Nested catch block");
    }
}
