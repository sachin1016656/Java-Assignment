package assignment;

import java.util.Scanner;

//WAP to print the sum of digit of each alphabets. Digit equal to a-A 1, b-B 2 and so on. If user has
//enter ABc sum will be 6.
public class String_4 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		String str = scanner.next();
		char charArray[] = str.toCharArray();
		int num[] = new int[5];
		for (int i = 0; i < charArray.length; i++) {
			if ((charArray[i] >= 65) && (charArray[i] <= 90)) {
				charArray[i] = (char) (charArray[i] - 64);
				num[i] = charArray[i];
			} else if ((charArray[i] >= 97) && (charArray[i] <= 122)) {
				charArray[i] = (char) (charArray[i] - 96);
				num[i] = charArray[i];

			}

		}
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}
		System.out.println("sum of the digit is:" + sum);
	}
}
