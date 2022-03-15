package assignment1;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  zeroArray[] = {0,0,0,0,0,0,0,0,0,0}; 
		for(int i=0;i<zeroArray.length;i++)
		{
		System.out.print(zeroArray[i]+" ");
		}

		System.out.println("\n");

    int arrayBonus[] = {2,2,1,1,1,1,1,1,1,1,1,1,1,1,1};
    for (int i = 0; i <arrayBonus.length; i++) 
    {
    	arrayBonus[i]+=1;
        System.out.print(arrayBonus[i]+" ");
    }
    
	System.out.println("\n");

    int bestscores[]= {90,85,80,75,70};
    for(int i=0;i<bestscores.length;i++) 
    {
        System.out.print(bestscores[i]+" ");
	}
	}
}
