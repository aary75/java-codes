import java.util.*;

public class product {
	public static void main(String[] args) {
		String num_1 = "123";
		String num_2 = "4";
		
		String string_1 = "";
		String string_2 = "";
		
		if(num_1.length() > num_2.length()){
		    string_1 = num_1;
		    string_2 = num_2;
		}
		else{
		    string_1 = num_2;
		    string_2 = num_1;
		}
		
		String ans = "";
		String str1 = "";
		
		for(int i=string_2.length()-1;i>=0;i--){
		    char ch = string_2.charAt(i);
		    
		    int a = ch - '0';
		    
		    for(int j = string_1.length()-1;j>=0;j--){
		        
		        int b = string_1.charAt(i) - '0';
		        
		        int product = a * b;
		        
		        if(str1.length() != 0){
		           int sum = Integer.parseInt(str1);
		           product += sum;
		           str1 = "";
		        }
		        
		        if(product >= 10){
		            String str = String.valueOf(product);
		            str1 = str.substring(0,str.length()-1);
		            
		            ans += str.charAt(str.length()-1);            
		        }
		    }
		}
		
		System.out.print(ans);
	}
}

