package com.java_exercise;

import java.util.Arrays;

public class ConcatTwoArrays2 {
	public static void concatOfTwoArrays() {
		int[] num = { 10, 20, 30 };
		int[] num1 = { 40, 50, 60, 80 };
		int[] num2 = new int[num.length + num1.length];
		int j=0;
		for (int i = 0; i < num.length; i++) {
			num2[j] = num[i];
			j++;
		}
		for (int i = 0; i < num1.length; i++) {
			num2[j] = num1[i];
			j++;
		}

			System.out.println(Arrays.toString(num2));
	}

	public static void main(String[] args) {
		concatOfTwoArrays();
	}
}