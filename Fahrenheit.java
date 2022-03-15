package assignment1;
import java.util.Scanner;
public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value in Fahrenheit:");
		double Fahrenheit=input.nextDouble();
        double  celsius =(( 5 *(Fahrenheit - 32.0)) / 9.0);
        System.out.println(Fahrenheit + " degree fahrenheit is equal to " + celsius + " degree in celsius");
	}

}
