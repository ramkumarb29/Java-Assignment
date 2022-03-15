package assignment1;
import java.util.Scanner;

public class VolumeofSphere {
	double radius,volume;
	
	Scanner input=new Scanner(System.in);
	
	public void spherevolume()
	{
		System.out.println("Enter the value of radius:");
		radius=input.nextDouble();
		volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
		System.out.println("Enter the volume of sphere:"+volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    VolumeofSphere vs=new VolumeofSphere();
    vs.spherevolume();
	}

}
