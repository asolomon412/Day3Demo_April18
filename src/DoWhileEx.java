
public class DoWhileEx {

	public static void main(String[] args) {

		int num = 5;
		System.out.println(num++);
		System.out.println(num);

		System.out.println(); // this is just for formatting to show the difference between examples
		int num2 = 7;
		System.out.println(--num2);

		/*
		 * variable declared outside of loop so the while condition can see it
		 */
		int counter = 100;

		/*
		 * The do loop will always execute the code between the do brackets at least
		 * once
		 */
		do {

			System.out.println("Counter: " + counter--); // you can do the decrement here or on line 27
			// System.out.println("Counter: " + --counter); be careful here
			// counter--;

		} while (counter > 0);

	}

}
