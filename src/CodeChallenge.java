import java.util.Scanner;

public class CodeChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number between 20 and 200");

		int userNum = scan.nextInt();

		if (userNum < 200 && userNum > 20) {
			if (userNum % 15 == 0) {
				System.out.println("Number is divisible by 15");
			}
			if (userNum % 5 == 0) {
				System.out.println("Number is divisible by 5");
			}
			if (userNum % 3 == 0) {
				System.out.println("Number is divisible by 3");
			}

		} else {
			System.out.println("Your number is not between 20 and 200");
		}
		scan.close();

	}

}
