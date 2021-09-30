package in.jcore.exercise4;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
	System.out.println("please enter the number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int reverse =0;
	int temp=0;
	while(num!=0) {
		temp= num%10;
		reverse= reverse*10+ temp;
		num= num/10;
	}
	System.out.println("reverse of entered number is ="+reverse);
	}
}
