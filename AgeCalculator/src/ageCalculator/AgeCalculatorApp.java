package ageCalculator;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeCalculatorApp {

	public static void main(String[] args){
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getWeekYear());
		Scanner keyboard = new Scanner(System.in);
		int year = 2016;
		int born =-1;
			
		do{
			try{
				System.out.println("Enter the year you were born: ");
				born = keyboard.nextInt();
				if(born <= 0){
					System.out.printf("%d is less then 0. Please input a positive number%n", born);
				}
			}catch (InputMismatchException e){
				System.out.printf("%d is not a number. Please input a positive number%n", born);	
			}
				
			keyboard.nextLine();
		}while(born < 0);
		
		System.out.printf("You are %d years old", (year- born));
		
	}
}
