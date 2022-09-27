package assignment;

import java.util.Scanner;

/* WAP to replace all small letter by capital and capital by small.*/
public class String_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		
		char charArray[]=str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if((charArray[i]>=65)&&(charArray[i]<=97)) {
				charArray[i]=(char)(charArray[i]+32);
			}
			else if((charArray[i]>=97)&&(charArray[i]<=122)) {
				charArray[i]=(char)(charArray[i]-32);
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
	}
	

}
