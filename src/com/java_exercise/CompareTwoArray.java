package com.java_exercise;

public class CompareTwoArray {

	public static boolean compareTwoArrays() {
		int count = 0;
		int num[] = { 10, 20, 30, 40 };
		int num1[] = { 10, 20, 30, 60 };

		if (num == null || num1 == null)
			return false;
		if (num.length != num1.length)
			return false;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == num1[i]) {
				count++;
			}

		}
		if (count == num.length)
			System.out.println("Both arrays are same");
		else
			System.out.println("Both arrays are not same");

		return false;
	}

	public static void main(String[] args) {
		compareTwoArrays();
	}

}
