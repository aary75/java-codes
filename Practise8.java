import java.util.Scanner;

abstract class perimeter{
    abstract public void peri();
}

class circle extends perimeter{
    int r;
    circle(int radius){
        this.r = radius;
    }
    public void peri(){
      System.out.println("Perimeter of Circle"+2*3.14*r);
     // System.out.println("Perimeter of Square"+4*r);
    }

}

class square extends perimeter{
    int l;
    square(int edge){
        this.l = edge;
    }
    public void peri(){
        System.out.println("Perimeter of Square"+4*l);
    }
}
public class Practise8 {
    public static void main(String args[]){
     perimeter sc = new circle(4);
     sc.peri();
     perimeter s1 = new square(8);
     s1.peri();
     
    }
}
