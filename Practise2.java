class Main1
{
    public int addNumber(int a,int b){
        int sum = a+b;
        return sum;
    }
    
	public static void main(String[] args) {
	int num1 = 25;
	int num2 = 15;
	
	Main1 Obj = new Main1();
	int result = Obj.addNumber(num1,num2);
	System.out.println("Sum is: "+ result);
	}
}

class Main{
    public void display1(){
        System.out.println("Method without parameter");
    }
    
    public void display2(int a){
        System.out.println("Method with a single parameter:" + a);
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        
        obj.display1();
        obj.display2(24);
    }
}
