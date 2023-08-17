package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import util.Alpha;
import util.VT100;

public class MapExample4 {

	public static void main(String[] args) throws InterruptedException {
		HashMap<Alpha, ArrayList<Alpha>> map = new HashMap<>();
		
		int c = 0;
		
		while(true) {
			c++;
			Alpha a = new Alpha();
			
			if(map.containsKey(a)) {
				//ArrayList<Alpha> list = map.get(a);
				//list.add(a);
				//map.put(a, list);
				map.get(a).add(a);
				
			} else {
				ArrayList<Alpha> list = new ArrayList<Alpha>();
				list.add(a);
				map.put(a, list);
			}
			
			if(map.size() == 800)
				break;
		}
		
		VT100.clearScreen();
		
		for(int i=1; i<21; i++) {
			for(int j=1; j<41; j++) {
				for(Entry<Alpha, ArrayList<Alpha>> e: map.entrySet()) {
					if(e.getKey().getLine() == i && e.getKey().getColumn() == j) {
						System.out.printf("[%d, %d]:", i, j);
						ArrayList<Alpha> value = e.getValue();
						for(Alpha a: value) {
							VT100.setFore(a.getFg());
							VT100.setBack(a.getBg());
							VT100.print(a.getCh());
							VT100.reset();
						}
						System.out.println();
					}
				}
			}
		}
		
		VT100.reset();
		System.out.println("Program End... count: " + c);
	}
}
