package com.java_exercise;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void removeDuplicate() {
		int num[] = { 10, 30, 40, 50, 30, 20, 40 };
		int num2[] = new int[num.length - 1];
		int j = 0, temp, k = 0;

		for (int i = 0; i < num.length; i++) {
			for (j = i; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int n : num) {
			System.out.print(" " + n);
		}

		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] != num[i + 1]) {
				num2[k] = num[i];
				k++;
			}
		}
		num2[num2.length - 2] = num[num.length - 1];

		System.out.println("\n last move");

		for (int i = 0; i < num2.length - 1; i++) {
			System.out.println(num2[i]);
		}
	}

	public static void main(String[] args) {
		removeDuplicate();
	}

}
