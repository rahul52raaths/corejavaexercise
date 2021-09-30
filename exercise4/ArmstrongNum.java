package in.jcore.exercise4;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =n;
		int sum=0;
		while(n>0) {
			int rem =n%10;
			 sum =rem*rem*rem + sum;
			 n=n/10;
		}
		if(sum==temp) {
			System.out.println("The number "+ sum+" is Armstrong number");
		} else {
			System.out.println("The number is not Armstrong number");
		}
	}

}
