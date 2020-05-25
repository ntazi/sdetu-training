package basics;

public class SalaryCalculator {
	public static void main (String[] args) {
		String career;
		System.out.println("Program is starting");
		career="Web Developer";
		System.out.println("My career: " + career);
		int hoursPerWeek=40;
		int weeksPerYear=52;
		double rate=42.5;
		double salary=hoursPerWeek*rate*weeksPerYear;
		System.out.println("As "+ career + " My salary: " + salary + " with the rate of:" + rate);		
	}

}
