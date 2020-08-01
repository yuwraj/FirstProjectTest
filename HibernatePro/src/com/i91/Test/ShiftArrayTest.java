package com.i91.Test;

import java.util.Arrays;

public class ShiftArrayTest {

	public static void main(String[] args) {
		int leftShiftLoc = 5;
		int intArray[] = { 1, 2, 3, 4, 5 };
		int index = 0;
		int intArrayNew[] = Arrays.copyOfRange(intArray, leftShiftLoc-1, intArray.length);
		for (int i=0; i < intArray.length; i++) {
			if ((i) >= intArrayNew.length) {
				intArray[index] = intArrayNew[index];
				index++;
			} else {
				intArray[intArrayNew.length+i] = intArray[i];
			}
		}
		for (int temp : intArray) {
			System.out.println(temp);
		}		
	}

	public void shiftManually() {
		System.out.println("Shift Array Test Manually");
		int leftShiftLoc = 5;
		int intArray[] = { 1, 2, 3, 4, 5 };
		int intArrayNew[] = new int[5];
		int index = 0;
		for (int i = leftShiftLoc; i < intArray.length; i++) {
			intArrayNew[index] = intArray[i];
			index++;
		}
		for (int i = 0; i < leftShiftLoc; i++) {
			intArrayNew[index] = intArray[i];
			index++;
		}
		for (int temp : intArrayNew) {
			System.out.println(temp);
		}
	}
}
