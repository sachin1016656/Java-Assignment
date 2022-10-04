package assignment;
//WAP to remove duplicate numbers from list of numbers.

public class Array_2 {

	public static void main(String[] args)
	{
		int arr[]= {10,20,78,10,25,89,80,80};

		int resarr[]=new int[arr.length];
		int ind=0;
     //retriving value from given array 
		for (int i = 0; i < arr.length; i++) 
		{
			int flag=0;
			//checking the value in given array 
			for (int j =0; j <resarr.length; j++) 
			{
			 
		        if(arr[i]==resarr[j]) 
		        {
		        	flag=1;
		        }
		        	
			}
			//inserting data inside the new array
			
			if(flag==0)
			{
				resarr[ind]=arr[i];
				ind++;
			}
		
		}
		
		//printing the array 
		for(int val :resarr)
		{
			if(val!=0)
			System.out.println(val);
		}
	}
}
