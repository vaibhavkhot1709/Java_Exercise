package com.java_exercise;

import java.util.Arrays;

public class AddOfTwoArrays {
	public static void additionOfTwoArrays() {
		int i, j;
		int[] num = { 10, 20, 30 };
		int[] num1 = { 40, 50, 60 };
		int[] num2 = new int[num.length];

		if (num.length == num1.length) {
			for (i = 0; i < num.length; i++) 
				num2[i] = num[i] + num1[i];
			System.out.println(Arrays.toString(num2));
		} else
			System.out.println("length of two arrays is not same");
	}

	public static void main(String[] args) {
		additionOfTwoArrays();
	}
}