package in.jcore.exercise4;

public class RandomNum {
	public static void main(String[] args) {
		for(int i=0; i<5;i++) {
			int randomNo= (int)(Math.random()*100);
			System.out.println(randomNo);
		}
	}

}
