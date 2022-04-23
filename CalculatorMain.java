import java.util.Scanner;

public class CalculatorMain {
public static void main(String[] args) {
	int choice = 0;
	Scanner sc = new Scanner(System.in);
	
	do {
		displayMenu();
		System.out.println("Enter Operation to be performed: ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1: Addition add = new Addition();
		add.add();		
			break;
			
		case 2: Subtraction sub = new Subtraction();
		sub.sub();
			break;
		case 3: Division div = new Division();
		div.division();
			break;
		
		case 4: Multiplication mul = new Multiplication();
		mul.multiplication();
			break;
			
		default: System.out.println("Invalid Option");
			break;
		}
	}
	while (choice > 0);
		sc.close();
}

private static void displayMenu() {
	System.out.println("*************************************************************");
	System.out.println("\t\t Welcome to Siddhant's Calculator");
	System.out.println();
	System.out.println("*************************************************************");
	System.out.println("\t\t Developed By : Mr. Siddhant Somani   Batch: MS FSD Apr 2022 cohort 3");
	System.out.println("\t\t1. Addition");
	System.out.println("\t\t2. Subtraction");
	System.out.println("\t\t3. Division");
	System.out.println("\t\t4. Multiplication");
	
}
}
