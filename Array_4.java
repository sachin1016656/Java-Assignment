package assignment;
//An Array contain the n numbers you have to find out combination which satisfy Pythagoras
//Template. ( Pythagoras templates:- 3*3+4*4==5*5)
public class Array_4 {
	
	public static void main(String[] args) 
	{
	int ar[]= {3,2,2,7,4,8,5};

	for (int i = 0; i < ar.length; i++) 
	{
	    for (int j = i + 1; j < ar.length; j++) 
	    {
	        for (int k = j + 1; k < ar.length; k++) 
	        {
	            // Calculate square of array elements
	                int x = ar[i] * ar[i], 
	            		y = ar[j] * ar[j], 
	            		z = ar[k] * ar[k];
	     //Checking pythagoras Template(Pythagoras templates:- 3*3+4*4==5*5)
	            if (x == y + z || y == x + z || z == x + y)
	            	
	               System.out.println(ar[i] + "*" + ar[i] + "+" + ar[j] + "*"+ ar[j] + "=" +ar[k] + "*" + ar[k]    );
	        }
	    }
	}

	}

}
