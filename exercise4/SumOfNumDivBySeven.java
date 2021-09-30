package in.jcore.exercise4;

public class SumOfNumDivBySeven {
	public static void main(String[] args) {
		
		// sum of integers divisible by 7 between 100 to 200
		int sum =0;
		for(int i=101;i<200;i++) {
			int num = i%7;
			if (num==0) {
				sum = sum + i;
			}
			
		}System.out.println(sum);
	}
}