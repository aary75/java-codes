import java.util.Stack;

public class Stack {
    public static void main(String args[]){
        Stack st = new Stack();
        st.push(90);
        st.push(76);
        st.push(34);
        st.push(23);
        System.out.println(st.peek());
        System.out.println(st);
    }
}
