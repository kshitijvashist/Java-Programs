package com.algo.closestnumberinarray;

import java.util.TreeMap;

public class Find_Closest_Number_In_Array {
	public static void main(String arsg[]) {
		int array[] = { 1, 60, 0, -10, 100, 87, 69 };
		int number = 56;
		int num = getClosestNumber(array, number);
		System.out.println("Number is=" + num);
	}

	public static int getClosestNumber(int[] array, int number) {
		int diff[] = new int[array.length];

		TreeMap<Integer, Integer> keyVal = new TreeMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {

			if (array[i] > number) {
				diff[i] = array[i] - number;
				keyVal.put(diff[i], array[i]);
			} else {
				diff[i] = number - array[i];
				keyVal.put(diff[i], array[i]);
			}

		}

		int closestKey = keyVal.firstKey();
		int closestVal = keyVal.get(closestKey);

		return closestVal;
	}
}
