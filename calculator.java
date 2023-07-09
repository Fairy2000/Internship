package internship;

import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		 
		System.out.println("calculator:-");
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number:");
		double num1 = sc.nextDouble();
		System.out.print("Enter the Second Number:");
		double num2 = sc.nextDouble();
		System.out.print("Choose operator(+,-,*,/,%):");
		char operator = sc.next().charAt(0);
		sc.close();
		
		double result=0;
		switch(operator)
		{
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;	
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;	
		default:
			System.out.println("Invalid Input");
		}
		System.out.print("Result:"+ result);
		
	}	   
}
