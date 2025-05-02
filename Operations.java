package task;

public class Operations {
	public static void add(int a,int b) {
		System.out.println("Addition of a+b = "+ (a+b));
	}
	
	public static void subtract(int a,int b) {
		System.out.println("Subtract of a-b = "+ (a-b));
	}
	public static void multiply(int a,int b) {
		System.out.println("Multiplication of a*b = "+ (a*b));
	}
	public static void divide(int a,double b) {
		System.out.println("Division of a/b = "+ (a/b));
	}
	public static void modulus(int a,int b) {
		System.out.println("Modulus of a%b = "+ (a%b));
	}
	
	
	
	
	public static void main(String[] args) {
		add(10,5);
		subtract(10,5);
		multiply(10,5);
		divide(10,5);
		modulus(10,5);
	}

}
