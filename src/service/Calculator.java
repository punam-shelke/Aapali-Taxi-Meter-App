package service;

import model.Car;

public class Calculator {
	//method to calculate fare
public int calculate(Car car , int distance) {
	final int baseDistance = car.getBaseDistance();
	final int baseCharge = car.getBaseCharge();
	final int nextDistance = car.getNextDistance();
	final int nextCharge = car.getNextCharge();
	final int additionalCharge = car.getAdditionalCharge();
	final int limit = car.getLimit();
	final int flatCharge = car.getFlatCharge();
	//if distance is lesser than base
	if(distance <= baseDistance) {
		return baseCharge;
	}
	//if distance lesser than next
	else if(distance <= nextDistance) {
		return baseCharge + (distance - baseDistance)*nextCharge;
	}
	//additional distance lesser than limit
	else if(distance > nextDistance && distance<=limit) {
		return baseCharge + (nextDistance - baseDistance)*nextCharge+(distance - nextDistance)*additionalCharge;
	}
	//greater than limit
	else {
		return distance*flatCharge;
	}
}
}
