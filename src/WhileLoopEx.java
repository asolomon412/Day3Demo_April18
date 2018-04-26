import java.util.Scanner;

public class WhileLoopEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			// Your code should start here

			System.out.println("Do some stuff");

			// This is where your code should end if you are using this as a template
			System.out.println("Do you want to continue? (y/n)");
			cont = scan.nextLine();

		}

		// Let the user know that the program has ended
		System.out.println("Goodbye");
		scan.close();

		
		
		// don't use this for the template
		// example of how you can set up a while loop to mimic a for loop
		int i = 0;

		while (i < 5) {
			System.out.println(i + " Hello");
			i++;
		}

	}

}
