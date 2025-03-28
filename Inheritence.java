import java.util.Scanner;

class Shape1{
    public int getArea(){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        return l*b;
    } 

    public int triangle(){
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        int h = sc1.nextInt();
        sc1.close();
        return (b*h)/2;
    }
}

class circle{
    public void peri(){
        System.out.println("Shape is circle");
    }
}

class Inheritence extends Shape1{
    public static void main(String[] args){
        Inheritence myObj  = new Inheritence();
        int b = myObj.getArea();
        System.out.println("Area of Rectangle is "+b);

        int c = myObj.triangle();
        System.out.println("Area of triangle is "+c);
    }
}