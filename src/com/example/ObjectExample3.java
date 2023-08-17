package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class ObjectExample3 {

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
	}
	
	public static void main(String[] args) {
		var a1 = new Alpha(10, 5);
		var a2 = new Alpha(10, 5);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		HashSet<Alpha> set = new HashSet<Alpha>();
		
		set.add(a1);
		set.add(a2);
		
		System.out.println(set);
		
		Date d1 = new Date(100, 1, 1);
		Date d2 = new Date(100, 1, 1);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		
		LocalDate now1 = LocalDate.of(2023, 8, 16);
		LocalDate now2 = LocalDate.of(2023, 8, 16);
		System.out.println(now1.hashCode());
		System.out.println(now2.hashCode());
	}
}
