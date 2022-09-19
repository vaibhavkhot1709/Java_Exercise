package com.java_exercise;

import java.util.Arrays;

public class RemoveGivenElement {
	public static void removeGivenElement() {
		int num[] = { 10, 30, 20, 70, 55,80,65 };
		int element = 70;

		for (int i = 0; i < num.length; i++) {
			if (element == num[i]) {
				for (int j=i; j < num.length-1; j++) {
					num[j] = num[j + 1];
				}
				break;
			}
			
		}
		int [] num2=new int[num.length-1];
		for(int i=0;i<num2.length;i++) {
			num2[i]=num[i];
		}
		System.out.println(num2.length);
		for (int n : num2) {
			System.out.print(" " +n);
		}
	}

	public static void main(String[] args) {
		removeGivenElement();
	}

}
