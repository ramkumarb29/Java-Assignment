package assignment1;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    int a,b;
    int sum;
    int difference;
    int product;
    int division;
    
    System.out.println("Enter the value of a:");
    a=input.nextInt();
    System.out.println("Enter the value of b:");
    b=input.nextInt();
    
    sum=a+b;
    difference=a-b;
    product=a*b;
    division=a/b;
    
    System.out.println("Sum of two integers:"+sum);
    System.out.println("Difference of two integers:"+difference);
    System.out.println("Product of two integers:"+product);
    System.out.println("Division:"+division);
    
	}

}
