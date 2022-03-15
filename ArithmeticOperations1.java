package assignment1;
import java.util.Scanner;

public class ArithmeticOperations1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int num1,num2,num3;
	    
		int sum;
		int average;
		int product;
	    		
	    System.out.println("Enter the first integer:");
	    num1=input.nextInt();
	    System.out.println("Enter the second integer:");
	    num2=input.nextInt();
	    System.out.println("Enter the third integer:");
	    num3=input.nextInt();
	    
	    sum=num1+num2+num3;
	    System.out.println("Sum of three integers:"+sum);
	    
	    average=sum/3;
	    System.out.println("Average of three integers:"+average);
	    
	    product=num1*num2*num3;
	    System.out.println("Product of three integers:"+product);
	    
	    int smallest=num1;
	    if(num2<smallest)
	    	smallest=num2;
	    if(num3<smallest)
	    	smallest=num3;
	    {
	    	System.out.println("Smallest of the number is:"+smallest);
	    }
	    
	    int largest=num1;
	    if(num2>largest)
	    	largest=num2;
	    if(num3>largest)
	    	largest=num3;
	    {
	    	System.out.println("Largest of the number is:"+largest);
	    }
	    
	}

}
