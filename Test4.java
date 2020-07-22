package Assignment1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		String firstthreeChars="";
		if(str.length()>3) {
			firstthreeChars=str.substring(0,3);
			System.out.println(firstthreeChars +str+ firstthreeChars);
		}
		else {
			firstthreeChars=str;
		}
		
		
		/*
		 * char result;
		 	char count;
		 * if(count!=indexof(3)) { for(int i=0;i<=2;i++) { count=str.charAt(i);
		 * result=count;
		 * 
		 * System.out.println(result+str+result); } }else {
		 * 
		 * }
		 */

	}

}
