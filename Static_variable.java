class Student{
    int a;
    static int id = 35;

void change(){
    System.out.println(id);
}
}

public class Static_variable {
    public static void main(String args[]){
      Student o1 = new Student();
      Student o2 = new Student();
      o1.change();
      Student.id = 1;
      o2.change();
      o1.change();
    }
}
