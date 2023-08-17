package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			list.add((int)(Math.random()*10));
		}
		
		System.out.println(list);
		System.out.println(list.size());
	}
	
	public static void main2(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5};
		int[] nums2 = new int[10];
		
		System.arraycopy(nums, 0, nums2, 0, nums.length);
		
		nums2[5] = 6;
		nums2[6] = 7;
		nums2[7] = 8;
		
		System.out.println(nums2);
		System.out.println(Arrays.toString(nums2));
				
	}
}
