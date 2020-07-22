package Assignment1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		System.out.println("Enter an operator (+,-,*,/) :");
		char operator=sc.next().charAt(0);
		double result;
		switch(operator) {
		case '+':
			result=a+b;
			break;
			
		case '-':
			result=a-b;
			break;
			
		case '*':
			result=a*b;
			break;
			
		case '/':
			result=a/b;
			break;
			
		default:
			System.out.println("You have entered wrong operator");
			return;
		}
		System.out.println(a+"operator"+b+" = "+result);
		
	}

}
