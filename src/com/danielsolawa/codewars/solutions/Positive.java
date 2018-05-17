package com.danielsolawa.codewars.solutions;

import java.util.Arrays;

public class Positive {

	  public static int sum(int[] arr){
		    return Arrays.stream(arr).map(n -> n > 0 ? 0 : n).sum();
	  }
	
}
