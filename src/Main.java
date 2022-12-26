import java.util.Scanner;

/**
 * @author Simon Pirko on ${DATE}
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		Scanner scanner = new Scanner(System.in);

		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		String type = scanner.next();

		double result = 0;
		switch (type) {
			case "sum":
				result = num1 + num2;
			default:
				break;
		}

		System.out.println("Result " + result);

//		System.out.println(Math.max(34, 890));
	}
}
