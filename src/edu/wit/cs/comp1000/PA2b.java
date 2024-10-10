package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		System.out.printf("Enter a b c: ");
		Scanner scanner = new Scanner (System.in);
		
		
		//Prompt to enter coefficients
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double discriminant = (b * b) - (4 * a * c);
		// this is for calculating
		
		// checking if discriminant is less then zero
		       
		if (discriminant < 0) {
			System.out.println ("Roots: imaginary");
		}else if (discriminant == 0) {
			double root = -b / (2 * a);
			System.out.printf("Roots: %.2f%n", root);
	   	}else {
			double sqrtDiscriminant = Math.sqrt(discriminant);
			double root1 = (-b - sqrtDiscriminant) / (2 * a);
			double root2 = (-b + sqrtDiscriminant) / (2 * a);
			
		if (root1 > root2) {
			double temp = root1;
			root1 = root2;
			root2 = temp;
		}
		System.out.printf("Roots: $.2f, %.2f%n", root1, root2);
			
		}
		
	}

}
