package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class ObjectExample4 {

	static class Alpha {
		int line;
		int column;
		
		public Alpha(int line, int column) {
			this.line = line;
			this.column = column;
		}
		@Override
		public int hashCode() {
			return Objects.hash(line, column);
		}
		
		@Override
		public String toString() {
			return String.format("[%d,%d]", line, column);
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Alpha) {
				Alpha target = (Alpha) obj;
				return this.line == target.line && this.column == target.column;
			}
			return false;
		}
	}
	
	public static void main(String[] args) {
		HashSet<Alpha> set = new HashSet<Alpha>();
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
		System.out.println(set.add(new Alpha(10, 5)));
		
		System.out.println(set);
	}
	
	public static void main2(String[] args) {
		Alpha a1 = new Alpha(10, 5);
		Alpha a2 = new Alpha(10, 5);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.equals(a2));
		
		LocalDate now1 = LocalDate.of(2023, 1, 12);
		LocalDate now2 = LocalDate.of(2023, 1, 12);
		System.out.println(now1 == now2);
		System.out.println(now1.equals(now2));
		
	}
}
