//5. Write a Java program to create Simple Calculator .  
package ZensarTraining;

public class SimpleCalculator {

	void addition(int a, int b) {
		System.out.println(a + b + " is Addtion");
	}

	void substract(int a, int b) {
		System.out.println(a - b + " is Substraction");
	}

	void division(int a, int b) {
		System.out.println(a / b + " is Division");
	}

	void multiplication(int a, int b) {
		System.out.println(a * b + " is Multiplication");
	}

	void modulo(int a, int b) {
		System.out.println(a % b + " is Modulo");
	}

	void power(int a, int b) {
		System.out.println((a ^ b) + " is Power");
	}

	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		sc.addition(12, 9);
		sc.substract(12, 8);
		sc.division(12, 6);
		sc.modulo(12, 4);
		sc.multiplication(2, 4);
		sc.power(2, 6);

	}

}
