package controller;
import java.util.Scanner;

import model.Mini;
import model.SUV;
import model.Sedan;
import service.Calculator;
public class Main {
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	Calculator calculator = new Calculator();
	//input
	int distance = sc.nextInt();
	int miniFare , sedanFare , suvFare;
	//values in question
	final int BASE_DISTANCE_MINI = 3;
	final int BASE_DISTANCE_SEDAN = 5;
	final int BASE_DISTANCE_SUV = 5;
	final int BASE_CHARGE_MINI = 50;
	final int BASE_CHARGE_SEDAN = 80;
	final int BASE_CHARGE_SUV = 100;
	final int NEXT_DISTANCE_MINI = 18;
	final int NEXT_DISTANCE_SEDAN = 20;
	final int NEXT_DISTANCE_SUV = 20;
	final int NEXT_CHARGE_MINI = 10;
	final int NEXT_CHARGE_SEDAN = 12;
	final int NEXT_CHARGE_SUV = 15;
	final int ADDITIONAL_CHARGE_MINI = 8;
	final int ADDITIONAL_CHARGE_SEDAN = 10;
	final int ADDITIONAL_CHARGE_SUV = 12;
	final int LIMIT_MINI = 75;
	final int LIMIT_SEDAN = 100;
	final int LIMIT_SUV = Integer.MAX_VALUE;
	final int FLAT_CHARGE_MINI = 8;
	final int FLAT_CHARGE_SEDAN = 10;
	final int FLAT_CHARGE_SUV = 0;
	//CALCULATE THE FARE
	Mini mini = new Mini(BASE_DISTANCE_MINI, BASE_CHARGE_MINI, NEXT_DISTANCE_MINI, NEXT_CHARGE_MINI, ADDITIONAL_CHARGE_MINI, LIMIT_MINI, FLAT_CHARGE_MINI);
	Sedan sedan = new Sedan(BASE_DISTANCE_SEDAN, BASE_CHARGE_SEDAN, NEXT_DISTANCE_SEDAN, NEXT_CHARGE_SEDAN, ADDITIONAL_CHARGE_SEDAN, LIMIT_SEDAN, FLAT_CHARGE_SEDAN);
	SUV suv = new SUV(BASE_DISTANCE_SUV, BASE_CHARGE_SUV, NEXT_DISTANCE_SUV, NEXT_CHARGE_SUV, ADDITIONAL_CHARGE_SUV, LIMIT_SUV, FLAT_CHARGE_SUV);
	miniFare = calculator.calculate(mini, distance);
	sedanFare = calculator.calculate(sedan, distance);
	suvFare = calculator.calculate(suv, distance);
	//output
	System.out.println(" Mini - Rs."+miniFare+" Sedan - Rs."+sedanFare+" SUV - Rs."+suvFare);
	sc.close();
}
}
