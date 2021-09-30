package in.jcore.exercise4;
import java.util.Scanner;
public class SumOFEvenOdd {
	public static void main(String[] args) {
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumEven=0;
		int sumOdd=0;
		int countEven=0;
		int countOdd=0;
		for(int i=1;i<=n;i++) 
		{
			int num= i%2;
			if(num==0) {
				sumEven=i + sumEven;
				countEven++;
				}
			else {
				sumOdd= i+sumOdd;
				countOdd++;
			}
		}
		int averageEve=sumEven/countEven;
		int averageOdd = sumOdd/countOdd;
		System.out.println("average of even number is "+averageEve);
		System.out.println("average of odd number is "+averageOdd);
	}
}
