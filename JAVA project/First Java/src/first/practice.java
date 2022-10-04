package first;

public class practice {

	
	public static void main(String[] args) {
		
		//Calculator
		
	System.out.println(add(100, 50));
	System.out.println(substract(20, 5));
	System.out.println(multifly(2500, 4000));
	System.out.println(devide(8500, 3));

		
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
		
	}
	public static int substract(int num1, int num2) {
		return num1 - num2;
		
	}
	public static long multifly(long num1, long num2) {
		return num1 * num2;
	}
	public static double devide(double num1, double num2) {
		return num1 / num2;
	}
}
