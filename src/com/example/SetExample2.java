package com.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class SetExample2 {
	static Random r = new Random();
	
	static class Alpha {
		int line;
		int column;
		
		public Alpha() {
			line = r.nextInt(1, 11);
			column = r.nextInt(1, 11);
		}
		
		public Alpha(int line, int column) {
			this.line = line;
			this.column = column;
		}
		
		@Override
		public int hashCode() {
			System.out.println("hashCode..." + Objects.hash(line, column));
			return Objects.hash(line, column);
		}
	}
	
	public static void main(String[] args) {
		var set = new HashSet<Alpha>();
		
		set.add(new Alpha(10, 5));
		set.add(new Alpha(10, 5));
				
	}
	
	public static void main2(String[] args) {
		HashSet<Alpha> s = new HashSet<>();
		int count = 0;
		
		while(true) {
			s.add(new Alpha());
			count++;
			if(s.size() == 100) {
				break;
			}
		}
		
		System.out.println(count);
		System.out.println(s.size());
	}
}
