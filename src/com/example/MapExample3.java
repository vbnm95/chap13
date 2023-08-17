package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import util.Alpha;
import util.VT100;

public class MapExample3 {

	public static void main(String[] args) throws InterruptedException {
		HashMap<Alpha, ArrayList<Alpha>> map = new HashMap<>();
		
		Random r = new Random();
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
		
		for(Entry<Alpha, ArrayList<Alpha>> e: map.entrySet()) {
			//System.out.println(e.getKey() + "=" + e.getValue());
			e.getKey().show();
			ArrayList<Alpha> value = e.getValue();
			value.get(value.size()-1).show(0, 41);
			
			Thread.sleep(10);
		}

		
		
		VT100.cursorMove(21, 1);
		VT100.reset();
		System.out.println("Program End... count: " + c);
	}
}
