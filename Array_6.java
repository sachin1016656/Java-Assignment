package assignment;
//An array contains different numbers. You have to calculate average of two consecutive
//numbers.
public class Array_6 {


	public static void main(String[] args) 
	{
	int ar[]= {4,5,8,9,10};	
	double sum=0;
	
	 for(int i = 0; i + 1 < ar.length; i++)
     {
         // adding the consecutive numbers
         sum = ar[i] + ar[i + 1];
         
         System.out.print(sum/2 +" ");
     }
	}
}
