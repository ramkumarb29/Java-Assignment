package assignment1;
import java.util.Scanner;

public class LargestValue {
	public void largestvalue()
	{
		Scanner input=new Scanner(System.in);
	    
	    int counter=0;
	    int largest=0;
	    int number=0;
	    int total=0;
	    
	    while(counter<10)
	    {
	    	System.out.println("Enter number:");
	    	number=input.nextInt();
	    	if(number>largest)
	    	{
	    		largest=number;
	    	}
	    	total=total+number;
	    	counter++;

	}
	    System.out.println("The total is:"+total);
	    System.out.println("The largest value is:"+largest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LargestValue v=new LargestValue();
    v.largestvalue();
    
    }
    
	}


