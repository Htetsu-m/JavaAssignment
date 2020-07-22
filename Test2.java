package Assignment1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		System.out.println("Enter position index :");
		int p=sc.nextInt();
		
		System.out.println(charRemove(str,p));
	}
	public static String charRemove(String str,int p) {
		return str.substring(0,p)+str.substring(p+1);
	}

}
