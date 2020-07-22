package Assignment1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		int l=str.length();
		
		if(l<=1) {
			System.out.println(str);
		}else {
			char start=str.charAt(0);
			char end=str.charAt(l-1);
			
			System.out.println(end+str.substring(1,l-1)+start);
		}
		
	}

}
