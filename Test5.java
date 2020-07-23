package Assignment1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string : " );
		String str=scanner.nextLine();
		
		char ch[] = str.toCharArray(); 
	    for (int i = 0; i < str.length(); i++) { 
	 
	    	if (i == 0 && ch[i] != ' ' ||  ch[i] != ' ' && ch[i - 1] == ' ') { 
	    
	    		if (ch[i] >= 'a' && ch[i] <= 'z') { 
	 
	    			ch[i] = (char)(ch[i] - 'a' + 'A'); 
	                 
	    		} 
	    		else if (ch[i] >= 'A' && ch[i] <= 'Z')  
	            	   
	    			ch[i] = (char)(ch[i] + 'a' - 'A');             
	        	} 
	     
	     } 
	       String str2= new String(ch); 
	       System.out.print(str2);
	}

}
