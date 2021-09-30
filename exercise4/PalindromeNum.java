package in.jcore.exercise4;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
		
		System.out.println("Please Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pali = num;
		int reverse =0;
		while(num!=0) {
			int temp =num%10;
			 reverse = (reverse*10)+temp;
			 num = num/10;
		}
		System.out.println("the reverse of number is "+reverse);
		if(reverse==pali) {
			System.out.println("the number is palindrom");
		} else {
			System.out.println("number is not a palindrom number");
		}
	}

}
