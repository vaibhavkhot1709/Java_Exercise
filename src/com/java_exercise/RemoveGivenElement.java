package com.java_exercise;

import java.util.Arrays;

public class RemoveGivenElement {
	public static void removeGivenElement() {
		int num[] = { 10, 30, 20, 70, 55 };
		int count=0;
		int j=0,pos=2;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == num[pos]) 
				count++;
		}
		
		int num2[] = new int[num.length-count];
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] !=num[pos]) 
				num2[j]=num[i];
			j++;
		}
		
	}

	public static void main(String[] args) {
		removeGivenElement();
	}

}
