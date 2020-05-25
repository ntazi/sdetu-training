package basics;

public class Factorial {
	static int myFact(int n) {
		if (n==0||n==1) {
			return 1;
			}
		else {
			return n*myFact(n-1);
		}
		
		}
		

	public static void main(String[] args) {
		int n=5;
		System.out.println(myFact(n));
				

	}

}



