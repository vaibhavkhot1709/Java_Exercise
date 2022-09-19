package com.java_exercise;

import java.util.Arrays;

public class AddElement {

	public static void addElement() {
		int loc = 3;
		int ele = 80;
		int num[] = { 10, 20, 30, 40, 50 };
		int add[] = new int[num.length + 1]; // here increase length of array by 1
//	    here we copy existing array in add [] so last element bcom 0

		for (int i = 0; i < add.length - 1; i++)
			add[i] = num[i];

		//		here run add[] upto location
		for (int i = add.length - 1; i > loc; i--)
			add[i] = add[i - 1];
		// add element add location
		add[loc] = ele;

		System.out.println("now here element " + add[loc] + " goin to add in element " + ele);
		System.out.println(Arrays.toString(add));
	}

	public static void main(String[] args) {
		addElement();
	}

}
