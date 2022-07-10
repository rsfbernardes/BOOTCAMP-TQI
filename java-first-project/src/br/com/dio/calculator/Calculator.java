package br.com.dio.calculator;

import java.util.Scanner;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Type the first value: ");
		a = scan.nextInt();
		System.out.println("Type the second value");
		b = scan.nextInt();
		
		int sum = sum(a,b);
		int sub = sub(a,b);
		int mult = mult(a,b);
		int div = div(a,b);
		
		System.out.println("sum = " + sum);
		System.out.println("sub = " + sub);
		System.out.println("mult = " + mult);
		System.out.println("div = " + div);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mult(int a, int b) {
		return a * b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}

}
