package lab16countriesIO;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		// Set inputs: scanner and country text file
		Scanner scnr = new Scanner (System.in);
		CountriesTextFile.createBlankFile("countries.txt");
		List<Country> countries = CountriesTextFile.readFile();
		int input = 0;
		
		System.out.println("Welcome to the Countries Maintenance Application!");
		
		do {
			// Show list of choices and capture response
			printOptions();	
			input = Validator.getInt(scnr, " ", 1, 3);
			
			// Perform action based on response
			if (input == 1) {
				for (Country country : countries) {
				System.out.println(country.getCountryName());
				}
			}
			else if (input == 2) {
				String newCountry = Validator.getString(scnr, "Enter country:");
				Country country = new Country(newCountry);
				// System.out.println("Print country entered: " + newCountry);
				// System.out.println("Print object created: " + country);
				CountriesTextFile.appendLine(country);
				countries.add(country);
				System.out.println("This country has been saved!");
			}
			else {
				System.out.println("Buh-bye! Arrivederci!  Adios!  Aloha! Auf Wiedersehen");
				scnr.close();
			}
		} while (input != 3);
	}
	
	public static void printOptions () {
		System.out.println("\nWhat would you like to do?");
		System.out.println("1 - See the list of countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Exit");
		System.out.println("Enter menu number:");
	}

}
