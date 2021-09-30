package in.jcore.exercise4;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		System.out.println("Please Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		for(int i=1; i<=num;i++) 
		{
			int n = num%i;
			if(n==0) {
				count++;
			}
			
			
		}
		if (count==2) {
			System.out.println("The number is prime number");
		}else {
			System.out.println("The number is not prime number");
		}
	}

}
