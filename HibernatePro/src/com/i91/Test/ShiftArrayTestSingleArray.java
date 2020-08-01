package com.i91.Test;

public class ShiftArrayTestSingleArray {

	public static void main(String[] args) {
		System.out.println("Shift Array Test Single Array");
		int shiftLocation = 2;
		int[] intArray = { 10, 20, 30, 40, 50 };
		for (int i=0; i < shiftLocation; i++) {
			int temp = intArray[i];
			intArray[i] = intArray[intArray.length-shiftLocation];
			intArray[intArray.length-shiftLocation] = temp;
		}
		for (int intArrayTemp : intArray) {
			System.out.println(intArrayTemp);
		}
	}

}
