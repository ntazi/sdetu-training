package basics;

public class NumbersCalc {
	static int myMethod(int numA,int numB) {
		System.out.println("I just got executed");
		int sum=numA+numB;
		//System.out.println(sum);
		return sum;
	
	}
	public static void main(String[] args) {
		System.out.println(myMethod(2,6));
		
	
	}

}


