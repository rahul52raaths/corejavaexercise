package in.jcore.exercise4;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		
		int fact=1;
		System.out.println("please Enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			 fact = i*fact;
		}
	System.out.println(fact);
	}

}
