import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age: ");

		int age = scan.nextInt();

		if (age >= 18) {
			System.out.println("Congrats! You can legally vote!");
		} else if (age >= 16) {
			System.out.println("Head to voter education!");
		} else {

			System.out.println("Go do some research");
		}
		
		
		String name = "Antonella";
		
		if (name.equalsIgnoreCase("antonella")) {
			System.out.println("This is a match");
		}

		scan.close();

	}

}
