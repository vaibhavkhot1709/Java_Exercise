package com.java_exercise;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void removeDuplicate() {
		int k=0;
		int num[] = { 10, 30, 40, 30, 20, 60, 40, 50, 60, 70, 80,80 };
		int num2[]=new int[num.length];
		for(int i=0;i<num.length;i++) {
			int c=0;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					c++;
				}
			}if(c==0) {
				num2[k]=num[i];
				k++;
			}
		}
		int c[]=new int[k];
		for(int i=0;i<c.length;i++)
			c[i]=num2[i];
		System.out.println("Before removing "+Arrays.toString(num));
		System.out.println("After removing "+Arrays.toString(c));
	}
	public static void main(String[] args) {
		removeDuplicate();
	}

}
