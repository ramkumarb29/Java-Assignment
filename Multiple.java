package assignment1;
import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    
    int n1,n2;
    
    System.out.println("Enter the value of n1:");
    n1=input.nextInt();
    System.out.println("Enter the value of n2:");
    n2=input.nextInt();
    
    if(n2%n1==0)
    {
    	System.out.println(n1+" is a multiple of "+n2);
    }
    else
    {
    	System.out.println(n1+" is not a multiple of "+n2);
    }
	}

}
