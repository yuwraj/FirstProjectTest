package com.i91.Test;

import java.util.Arrays;

public class ShiftArrayTestWithCopyArray {

	public static void main(String[] args) {
		int shiftLocation = 3;
		int[] intArray = { 10, 20, 30, 40, 50, 60 };
		// Need to throw Exception when shiftLocation > intArray.length
		int[] tempArray1 = Arrays.copyOfRange(intArray, shiftLocation, intArray.length);
		int[] tempArray2 = Arrays.copyOfRange(intArray, 0, shiftLocation);
		int index = 0;
		for (int i = 0; i < tempArray1.length; i++) {
			intArray[index] = tempArray1[i];
			index++;
		}
		for (int i = 0; i < tempArray2.length; i++) {
			intArray[index] = tempArray2[i];
			index++;
		}
		for (int temp : intArray) {
			System.out.println(temp);
		}
	}

}
