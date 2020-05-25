package basics;

public class SumOfNumbers {
		//public static void main(String[] args) {
		static int myMethod(int n) {
			 if (n>=1) {
				 return n+myMethod(n-1);
			 }
			 else {
				 return 0;
			  }
				
				
		}
		// TODO Auto-generated method stub
			
		public static void main(String[] args) {
			int n=5;
			System.out.println(myMethod(n));
			
		//1+2+3+4+5=15{
		//n=n+(n-1)
	}

}

//1.n if n=5 then n+(n-1) or 