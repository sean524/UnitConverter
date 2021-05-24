import java.util.Scanner;

public class Converter {			
	
	public static void main(String[] args) {
		
		//To hold strings for each unit of measurement involved.
		String[][] units = { {"teaspoons","tablespoons","cups"}, 
				{"centimeters","meters","kilometers"}, 
				{"US gallons","Imperial gallons",""} };

		//The scanner to take input from the user.
		Scanner scan = new Scanner(System.in);
		
		int menu1 = 0;
		while (menu1 != 4) {
			Menu();
			menu1 = scan.nextInt();
			System.out.println();

			switch (menu1) {
			//Volume conversions
			case 1: {
				//Print Volume Menu and take char as input
				volumeMenu();
				char menu2 = scan.next().charAt(0);
				
				//Collect quantity
				System.out.print("Quantity: ");
				double qty = collectQuantity(scan);
				
				//Convert and display
				double conversion = convertVolume(menu2, qty);
				System.out.println("\n" + qty + " " + units[0][getOriginal(0,menu2)]
						+ " = " + conversion + " " + units[0][getNew(0,menu2)] + "\n");
				break;
			}
			//Distance conversions
			case 2: {
				//Print Distance Menu and take char as input
				distanceMenu();
				char menu2 = scan.next().charAt(0);
				
				//Collect quantity
				System.out.print("Quantity: ");
				double qty = collectQuantity(scan);
				
				//Convert and display
				double conversion = convertDistance(menu2, qty);
				System.out.println("\n" + qty + " " + units[1][getOriginal(1,menu2)]
						+ " = " + conversion + " " + units[1][getNew(1,menu2)] + "\n");
				break;
			}
			//Systems of Measure conversions
			case 3: {
				//Print SOM Menu and take char as input
				SMMenu();
				char menu2 = scan.next().charAt(0);
				
				//Collect quantity
				System.out.print("Quantity: ");
				double qty = collectQuantity(scan);
				
				//Convert and display
				double conversion = convertSM(menu2, qty);
				System.out.println("\n" + qty + " " + units[2][getOriginalSOM(2,menu2)]
						+ " = " + conversion + " " + units[2][getNewSOM(2,menu2)] + "\n");
				break;
			}
			}
		}
		System.out.println("Thank you for trying out the converter.\n"
						+ "Have a nice day! :D");

		scan.close();
	
	}

	
	
	// All purpose methods
	public static void Menu() {
		System.out.print("Please select an option:" 
				+ "\n1. Volume conversions" 
				+ "\n2. Distance conversions"
				+ "\n3. Weight conversions" 
				+ "\n4. Quit"
				+ "\nChoice: ");
	}
	
	public static double collectQuantity(Scanner scan) {
		
		double qty = scan.nextDouble();
		
		return qty;
	}

	/*
	 * These functions return an int for the 2D array units[][] corresponding with the
	 * correct string
	 */
	public static int getOriginal(int measure, char unit) {
		int i = 0;
		
		switch (unit) {
		case 'a': {
			break;
		}
		case 'b': {
			break;
		}
		case 'c': {
			i = 1;
			break;
		}
		case 'd': {
			i = 1;
			break;
		}
		case 'e': {
			i = 2;
			break;
		}
		case 'f': {
			i = 2;
			break;
		}
		}
		return i;
	}
	public static int getNew(int measurement, char unit) {
		
		int i = 0;
		
		switch (unit) {
		case 'a': {
			i = 1;
			break;
		}
		case 'b': {
			i = 2;
			break;
		}
		case 'c': {
			break;
		}
		case 'd': {
			i = 2;
			break;
		}
		case 'e': {
			break;
		}
		case 'f': {
			i = 1;
			break;
		}
		}
		return i;
	}

	public static int getOriginalSOM(int measure, char unit) {
		int i = 0;
		
		switch (unit) {
		case 'a': {
			break;
		}
		case 'b': {
			i = 1;
			break;
		}
		}
		
		return i;
	}
	public static int getNewSOM(int measurement, char unit) {
		int i = 0;
		
		switch (unit) {
		case 'a': {
			i = 1;
			break;
		}
		case 'b': {
			break;
		}
		}
		
		return i;
	}
	
	// Volume methods
	public static void volumeMenu() {
		System.out.print("Options:" 
				+ "\na. Teaspoons to Tablespoons" 
				+ "\nb. Teaspoons to Cups"
				+ "\nc. Tablespoons to Teaspoons" 
				+ "\nd. Tablespoons to Cups" 
				+ "\ne. Cups to Teaspoons"
				+ "\nf. Cups to Tablespoons"
				+ "\nChoice: ");
	}
	
	//Volume conversion options
	public static double convertVolume(char option, double qty) {
		double new_qty = 0;
		
		switch (option) {
		case 'a': {
			new_qty = teaspoonsToTablespoons(qty);
			break;
		}
		case 'b': {
			new_qty = teaspoonsToCups(qty);
			break;
		}
		case 'c': {
			new_qty = tablespoonsToTeaspoons(qty);
			break;
		}
		case 'd': {
			new_qty = tablespoonsToCups(qty);
			break;
		}
		case 'e': {
			new_qty = cupsToTeaspoons(qty);
			break;
		}
		case 'f': {
			new_qty = cupsToTablespoons(qty);
			break;
		}
		}
		
		return new_qty;
	}
	
	//Volume conversions
	public static double teaspoonsToTablespoons(double qty) {
		return qty / 3;
	}
	public static double teaspoonsToCups(double qty) {
		return qty / 48;
	}
	public static double tablespoonsToTeaspoons(double qty) {
		return qty * 3;
	}
	public static double tablespoonsToCups(double qty) {
		return qty / 16;
	}
	public static double cupsToTeaspoons(double qty) {
		return qty * 48;
	}
	public static double cupsToTablespoons(double qty) {
		return qty * 16;
	}

	
	
	// Distance methods
	public static void distanceMenu() {
		System.out.print("Options:"
				+ "\na. Centimeters to Meters" 
				+ "\nb. Centimeters to Kilometers"
				+ "\nc. Meters to Centimeters" 
				+ "\nd. Meters to Kilometers" 
				+ "\ne. Kilometers to Centimeters"
				+ "\nf. Kilometers to Meters"
				+ "\nChoice: ");
	}
	
	//Distance conversion options
	public static double convertDistance(char option, double qty) {
		double new_qty = 0;
		
		switch (option) {
		case 'a': {
			new_qty = centimetersToMeters(qty);
			break;
		}
		case 'b': {
			new_qty = centimetersToKilometers(qty);
			break;
		}
		case 'c': {
			new_qty = metersToCentimeters(qty);
			break;
		}
		case 'd': {
			new_qty = metersToKilometers(qty);
			break;
		}
		case 'e': {
			new_qty = kilometersToCentimeters(qty);
			break;
		}
		case 'f': {
			new_qty = kilometersToMeters(qty);
			break;
		}
		}
		
		return new_qty;
	}
	
	//Distance conversions
	public static double centimetersToMeters(double qty) {
		return qty / 100;
	}
	public static double centimetersToKilometers(double qty) {
		return qty * 100000;
	}
	public static double metersToCentimeters(double qty) {
		return qty * 100;
	}
	public static double metersToKilometers(double qty) {
		return qty / 1000;
	}
	public static double kilometersToCentimeters(double qty) {
		return qty / 100000;
	}
	public static double kilometersToMeters(double qty) {
		return qty * 1000;
	}

	
	
	// Systems of Measurement methods
	public static void SMMenu(){
		System.out.print("Options:"
				+ "\na. US Gallons to Imperial Gallons" 
				+ "\nb. Imperial Gallons to US Gallons" 
				+ "\nChoice: ");
	}
	
	//SOM conversion options
	public static double convertSM(char option, double qty){
		double new_qty = 0;
		
		switch (option) {
		case 'a': {
			new_qty = usToImperial(qty);
			break;
		}
		case 'b': {
			new_qty = imperialToUS(qty);
			break;
		}
		}
		
		return new_qty;
	}
	
	//SOM conversions
	public static double usToImperial(double qty) {
		return qty * 0.832674;
	}
	public static double imperialToUS(double qty) {
		return qty * 1.20095;
	}

}
