import java.lang.Math;
public class Operators {
    public static void main(String args[]){
        int p = 3,q = 3;

       // Arithmatic Operators
       System.out.println("Arithmatic operators");
        System.out.println(p+q);
        System.out.println(p-q);
        System.out.println(p*q);
        System.out.println(p/q);
        System.out.println(p%q);
        System.out.println(p^q);
        System.out.println(Math.pow(p,q));

        //Comparison Operators
        System.out.println("Comparison Operators");
        System.out.println(p==q);
        System.out.println(p>q);
        System.out.println(p<q);
        System.out.println(p>=q);
        System.out.println(p<=q);
        System.out.println(p!=q);

        //Logical Operators
        System.out.println("Logical Operators");
        System.out.println(p > q && p >= q);
        System.out.println(p > q || p >= q);
        System.out.println(!(p == q));

        //Assignment operator
        System.out.println("Assignment Operator");
        System.out.println(p=q);
        System.out.println(p+=q);
        System.out.println(p-=q);
        System.out.println(p*=q);
        System.out.println(p/=q);
        System.out.println(p%=q);

        //Java Unary operator
        System.out.println("Java Unary Operator");
        System.out.println(+p);
        System.out.println(-q);
        System.out.println(p++); //Post Increment
        System.out.println(++p); //Pre Increment
        System.out.println(!(p==q));
    
    //Post -> Assignment then Increment
    //Pre -> Increment then Assignment
    System.out.println("Post Increment");
    System.out.println(p++);
    System.out.println(q++);
    System.out.println("Pre Increment");
    System.out.println(++p);
    System.out.println(++q);

    // Bitwise Operator
    System.out.println(p & q);  //Bitwise AND Operator
    System.out.println(p | q);  //Bitwise inclusive OR Operator
    System.out.println(p ^ q);  //Bitwise exclusive OR operator
    System.out.println(~p);     //Bitwise Compliment
    System.out.println(p >> q); //Bitwise Right Shift
    System.out.println(p << q); //Bitwise Left Shift
    System.out.println(p >>> q); //Number of places to shift
    //Associativity and Precedence
}
}