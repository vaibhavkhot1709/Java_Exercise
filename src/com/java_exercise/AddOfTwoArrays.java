package com.java_exercise;

public class AddOfTwoArrays {
	public static void additionOfTwoArrays() {
		int i, j;
		int[] num = { 10, 20, 30 };
		int[] num1 = { 40, 50, 60 };
		int[] num2 = new int[num.length];

		if (num.length == num1.length) {
			for (i = 0; i < num.length; i++) {
				num2[i] = num[i] + num1[i];
			}

			for (int n : num2) {
				System.out.print("\t" + n);
			}
		} else {
			System.out.println("length of two arrays is not same");
		}
	}

	public static void main(String[] args) {
		additionOfTwoArrays();
	}
}