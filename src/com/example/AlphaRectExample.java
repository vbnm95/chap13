package com.example;

import java.util.HashSet;
import java.util.function.Consumer;

import util.Alpha;
import util.VT100;

public class AlphaRectExample {

	public static void main(String[] args) {
		HashSet<Alpha> set = new HashSet<Alpha>();
		int c = 0;
		
		while(true) {
			Alpha a = new Alpha();
			set.add(a);
			c++;
			
			if(set.size() == 800)
				break;
		}
		
		VT100.clearScreen();
		
		//set.forEach(a -> a.show());
		
		set.forEach(new Consumer<Alpha>() {
			@Override
			public void accept(Alpha a) {
				a.show();
			}
		});
		
		VT100.cursorMove(21, 1);
		VT100.reset();
		System.out.println("Program End... count: " + c);
	}
	
	public static void main3(String[] args) {
		HashSet<Alpha> set = new HashSet<Alpha>();
		int c = 0;
		
		while(true) {
			Alpha a = new Alpha();
			set.add(a);
			c++;
			
			if(set.size() == 800)
				break;
		}
		
		VT100.clearScreen();
		
		for(Alpha a : set) {
			a.show();
		}
		
		VT100.cursorMove(21, 1);
		VT100.reset();
		System.out.println("Program End... count: " + c);
	}
	
	public static void main2(String[] args) {
		HashSet<Alpha> set = new HashSet<Alpha>();
		int c = 0;
		
		while(true) {
			Alpha a = new Alpha();
			set.add(a);
			c++;
			
			if(set.size() == 800)
				break;
		}
		
		VT100.clearScreen();
		var iter = set.iterator();
		
		while(iter.hasNext()) {
			Alpha a = iter.next();
			a.show();
		}
		
		VT100.cursorMove(21, 1);
		VT100.reset();
		System.out.println("Program End... count: " + c);
	}
}
