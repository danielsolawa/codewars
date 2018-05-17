package com.danielsolawa.codewars.solutions;

import java.util.Arrays;

public class School {

	public static int getAverage(int[] marks){
		return (int) Math.floor(Arrays.stream(marks).average().getAsDouble());
	}
	
}
