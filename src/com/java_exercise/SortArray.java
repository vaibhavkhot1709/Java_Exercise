package com.java_exercise;
public class SortArray {
	public static void assendingOrder() {
		int temporary, i, j;
		int[] num = { 10, 30, 40, 20, 55 };
		for (i = 0; i < num.length; i++) {
			for (j = i; j < num.length; j++) {
				if (num[i] > num[j]) {
					temporary = num[i];
					num[i] = num[j];
					num[j] = temporary;
				}
			}
		}
		System.out.println("assending order is as bellow");
		for (int n : num) {
			System.out.println("\t" +n);
		}
	}
	public static void dessendingOrder() {
		int temporary, i, j;
		int[] num = { 10, 30, 40, 20, 55 };
		for (i = 0; i < num.length; i++) {
			for (j = i; j < num.length; j++) {
				if (num[i] > num[j]) {
					temporary = num[i];
					num[i] = num[j];
					num[j] = temporary;
				}
			}
		}
		System.out.println("dessending order is as bellow");
		for (i = num.length - 1; i >= 0; i--) {
			System.out.println("\t" +num[i]);
		}
	}
	public static void main(String[] args) {
		assendingOrder();
		dessendingOrder();
	}
}