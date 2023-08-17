package com.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

public class ObjectExample2 {

	static class Alpha {
		int line;
		int column;
		
		public Alpha(int line, int column) {
			this.line = line;
			this.column = column;
		}
		
		@Override
		public String toString() {
			return String.format("[%d,%d]", line, column);
		}
	}
	
	public static void main(String[] args) {
		var a1 = new Alpha(10, 5);
		var a2 = new Alpha(20, 10);
		
		System.out.println(a1);
		System.out.println(a2);
		
		var list = new ArrayList<Integer>();
		list.add(10);
		System.out.println(list);
		
		int[] nums = {1, 2, 3};
		System.out.println(Arrays.toString(nums));
		
		Date d = new Date();
		System.out.println(d);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}
}
