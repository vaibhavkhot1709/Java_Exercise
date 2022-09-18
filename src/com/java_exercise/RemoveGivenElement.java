package com.java_exercise;

import java.util.Arrays;

public class RemoveGivenElement {
	public static int [] removeGivenElement() {
		int num[] = { 10, 30, 20, 70, 55 };
		int count=0;
		int j=0,pos=22;

		for (int i = 0; i < num.length; i++) {
			if (num[i] ==pos) 
				count++;
		}
		
		int num2[] = new int[num.length-count];
		
		for (int i = 0; i < num.length-1; i++) {
			if (num[i] !=pos) 
				num2[j]=num[i];
			j++;
		}
		for(int n:num2) {
			System.out.println(n);
		}
		return num2;
		
	}

	public static void main(String[] args) {
		removeGivenElement();
	}

}
