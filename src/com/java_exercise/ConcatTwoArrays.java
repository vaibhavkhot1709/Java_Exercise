package com.java_exercise;


public class ConcatTwoArrays {
	public static void concatOfTwoArrays() {
		int[] num = { 10, 20, 30 };
		int[] num1 = { 40, 50, 60, 80 };
		int[] num2 = new int[num.length + num1.length];

		for (int i = 0; i < num.length; i++) {
			num2[i] = num[i];
		}
		for (int i = 0; i < num1.length; i++) {
			num2[num.length + i] = num1[i];
		}

		for (int n : num2) {
			System.out.print(" " + n);
		}
	}

	public static void main(String[] args) {
		concatOfTwoArrays();
	}
}