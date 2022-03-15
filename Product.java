package assignment1;
import java.util.Scanner;


public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
    int x,y,z;
    int result;
    System.out.println("Enter the first integer:");
    x=input.nextInt();
    System.out.println("Enter the second integer:");
    y=input.nextInt();
    System.out.println("Enter the third integer:");
    z=input.nextInt();
    result=x*y*z;
    System.out.println("The product of three integers is "+result);
	}

}
