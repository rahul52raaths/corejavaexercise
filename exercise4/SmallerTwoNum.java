package in.jcore.exercise4;

public class SmallerTwoNum {
	public static void main(String[] args) {
		
	
	int a = 9;
	int b= 12;
	
	if(a>b) {
		System.out.println("the number " + b +" is Smaller");
	}
	else if(a==b){
		System.out.println("both number are equal to eachother");
	} 
	else {
		System.out.println("the number " + a +" is Smaller");
	}
	
	int c=Math.min(25, 10);
	System.out.println(c);
}
}
