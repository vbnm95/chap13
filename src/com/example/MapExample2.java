package com.example;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import util.Alpha;
import util.VT100;

public class MapExample2 {

	public static void main(String[] args) {
		HashMap<Alpha, Integer> map = new HashMap<>();
		
		Random r = new Random();
		int c = 0;
		
		while(true) {
			c++;
			Alpha a = new Alpha();
			
			if(map.containsKey(a)) {
				int count = map.get(a);
				map.put(a, ++count);
			} else {
				map.put(a, 1);
			}
			
			if(map.size() == 800)
				break;
		}
		
		//System.out.println(map);
		//System.out.println(c);
		
		VT100.clearScreen();
		
		for(Entry<Alpha, Integer> e: map.entrySet()) {
			//System.out.println(e.getKey() + "=" + e.getValue());
			e.getKey().show();
		}
		
		VT100.cursorMove(21, 1);
		VT100.reset();
		System.out.println("Program End... count: " + c);
	}
}
