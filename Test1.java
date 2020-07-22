package Assignment1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=s.nextLine();
		char result=str.charAt(str.length()-1);
		System.out.println(result+ str +result);

	}

}
