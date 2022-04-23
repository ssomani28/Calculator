import java.util.Scanner;

public class Multiplication {
	public void multiplication() {
		Scanner sc = new Scanner(System.in);
		double a, b, result;
		System.out.println("Provide 1st Number: ");
		a = sc.nextDouble();
		
		System.out.println("Provide 2nd Number: ");
		b = sc.nextDouble();
		
		result = a*b;
		
		System.out.println(a + " * " + b + " = " + result);
	
}
}
