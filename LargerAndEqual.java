package assignment1;
import java.util.Scanner;

public class LargerAndEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    int x,y;
    
    System.out.println("Enter the value of x:");
    x=input.nextInt();
    System.out.println("Enter the value of y:");
    y=input.nextInt();
    
    if(x>y)
    {
    	System.out.println(x+" is larger");
    }
    if(x<y)
    {
    	System.out.println(y+" is larger");
    }
    if(x==y)
    {
    	System.out.println("These numbers are equal");
    }
	}

}
