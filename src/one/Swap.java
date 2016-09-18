package one;

public class Swap {
/**
 * Write a program that swaps the values of two variables without using third variable.
 * @param args
 */
	public static void main(String[] args) {
		int a = 20, b = 10;
		a = a + b; 
		//a = 30 , b = 10;
		b = a - b; 
		//a = 30, b = 20;  
		System.out.println("b = " + b);
		a = a - b; // a = 10, b = 20
		System.out.println("a = " + a);
	}
}
