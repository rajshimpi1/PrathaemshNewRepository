package addition;

import java.util.Scanner;

public class AdditionOfFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! here we are do Addition of 2 float numbers");
		System.out.println("\n Enter first no :- ");
		float no1 = sc.nextFloat();
		System.out.println("\n Enter second no:- ");
		float no2 = sc.nextFloat();
		System.out.println("addition is "+no1+"+"+no2+" = "+ (no1+no2));
	}

}
