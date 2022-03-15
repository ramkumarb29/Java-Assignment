package assignment1;
import java.util.Scanner;

public class DecimalFormat {
	public static double average(int grades[],int max)
	{
	int sum=0;
	double average=0;
	
	for(int i=1;i<max;i++)
	{
		sum=sum+grades[i];
		average= sum/i;
	}
	return average;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    
    int i;
    int grades[]=new int[20];
    
    for(i=0;i<20;i++)
    {
    System.out.println("Enter grade:");
    grades[i]=input.nextInt();
    if(grades[i]==-1)
    break;
	}
    System.out.println(average (grades, i-1));
}
}
	



