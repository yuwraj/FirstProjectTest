package com.i91.Test;

public class ShiftArrayTest1 {
	public static void main(String[] args) {
		System.out.println("Shift Array Test Start");
		int shiftLocation = 2;
		int intArray[] = { 10, 20, 30, 40, 50 };
		// Need to throw Exception when shiftLocation > intArray.length
		int tempIntArray[] = new int[intArray.length];
		int index = 0;
		for (int i = shiftLocation; i < intArray.length; i++) {
			tempIntArray[index] = intArray[i];
			index++;
		}
		for (int i = 0; index < intArray.length && i <= intArray.length; i++) {
			tempIntArray[index] = intArray[i];
			index++;
		}
		for (int temp : tempIntArray) {
			System.out.println(temp);
		}
		System.out.println("Shift Array Test End");
	}
}
