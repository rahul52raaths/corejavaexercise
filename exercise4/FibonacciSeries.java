package in.jcore.exercise4;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a =1;
		int b =1;
		System.out.print(" "+a);
		System.out.print(" "+b);
		for(int i=0;i<10;i++) {
			int sum = a+b;
			a=b;
			b=sum;
			System.out.print("  "+sum);
		}
	}

}
