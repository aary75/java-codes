public class Nestedfinally_block {
    public static void main(String args[]){
        try{
            String str = "ankit";
            System.out.println(str.toUpperCase());
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Exception occurs here");
        }

        finally{
            try{
                System.out.println(10/0);
            }
            catch(Exception e1){
                System.out.println(e1);
                System.out.println("finally block has exception");
            }

            finally{
                System.out.println("finally block always execute");
            }
        }
        System.out.println("Nested finally block");
    }
}
