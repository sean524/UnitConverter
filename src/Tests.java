import java.util.Scanner;

public class Tests {
	
	/*
	try {
		menu1 = scan.nextInt();
	} catch (java.util.InputMismatchException e) {
		System.out.println("Sorry fella but that's an incorrect input ya got there. ;-;"
	+ "\nYou've got one more chance to get it right or else I'm gonna have to shut down and neither of us wants that to happen."
	+ "\nTry again with a number between 1-4.");
	} 
	*/
	
	public static void main(String[] args) {
		try {
			int[] myNumbers = {1,2,3};
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} 
	}

	/*
	public static void main(String[] args) {

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");

		}
	}
	*/

	/*
	 * public static void main(String[] args) {
	 * 
	 * String[][] units = { { "Teaspoons", "Tablespoons", "Cups" }, { "Centimeters",
	 * "Meters", "Kilometers" }, { "US Gallons", "Imperial Gallons",
	 * "Metric Gallons" } }; int menu1 = 0;
	 * 
	 * Scanner scan = new Scanner(System.in);
	 * 
	 * while (menu1 != 4) { System.out.println("Please select an option:" +
	 * "\n1. Volume conversions" + "\n2. Distance conversions" +
	 * "\n3. Systems of Measurement conversions" + "\n4. Quit");
	 * 
	 * System.out.print("Choice: "); menu1 = scan.nextInt();
	 * 
	 * switch(menu1) { case 1: { System.out.println("Options:"); for(int i = 0; i <
	 * 3; i++) { for(char option = 'a'; option < 'g'; option++)
	 * System.out.println(option + ". " + " to " + units[menu1 - 1][i]); } } } } }
	 */

}