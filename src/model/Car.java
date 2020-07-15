package model;

public class Car {
private int baseDistance;
private int baseCharge;
private int nextDistance;
private int nextCharge;
private int additionalCharge;
private int limit;
private int flatCharge;
public int getBaseDistance() {
	return baseDistance;
}
public void setBaseDistance(int baseDistance) {
	this.baseDistance = baseDistance;
}
public int getBaseCharge() {
	return baseCharge;
}
public void setBaseCharge(int baseCharge) {
	this.baseCharge = baseCharge;
}
public int getNextDistance() {
	return nextDistance;
}
public void setNextDistance(int nextDistance) {
	this.nextDistance = nextDistance;
}
public int getNextCharge() {
	return nextCharge;
}
public void setNextCharge(int nextCharge) {
	this.nextCharge = nextCharge;
}
public int getAdditionalCharge() {
	return additionalCharge;
}
public void setAdditionalCharge(int additionalCharge) {
	this.additionalCharge = additionalCharge;
}
public int getLimit() {
	return limit;
}
public void setLimit(int limit) {
	this.limit = limit;
}
public int getFlatCharge() {
	return flatCharge;
}
public void setFlatCharge(int flatCharge) {
	this.flatCharge = flatCharge;
}
public Car(int baseDistance, int baseCharge, int nextDistance, int nextCharge, int additionalCharge, int limit,
		int flatCharge) {
	super();
	this.baseDistance = baseDistance;
	this.baseCharge = baseCharge;
	this.nextDistance = nextDistance;
	this.nextCharge = nextCharge;
	this.additionalCharge = additionalCharge;
	this.limit = limit;
	this.flatCharge = flatCharge;
}

}
