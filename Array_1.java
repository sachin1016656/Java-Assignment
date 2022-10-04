package assignment;
//WAP to find third minimum number from list of numbers.

public class Array_1 {

	public static void main(String[] args) {
		
		int arr[]= {4,6,8,3,5,6,9,2,4,1};
		int min1=arr[0],min2=arr[0],min3=arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {
			if(min1>arr[i]) {
				
			min1=arr[i];
		}
		}
		for (int i = 0; i < arr.length; i++) {
			if(min2>arr[i]&&arr[i]!=min1)
				min2=arr[i];
			
			}
		for (int i = 0; i < arr.length; i++) {
			if(min3>arr[i]&&arr[i]!=min2&&arr[i]!=min1)
				min3=arr[i];
		}
	
		System.out.println(min3);
	}
}

