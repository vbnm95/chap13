package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import util.Alpha;
import util.VT100;

public class MapExample5 {
	
	static class AlphaStat extends Alpha {
		
		void printPosition() {
			System.out.printf("[%02d, %02d]", line, column);
		}
		
		void printChar() {
			VT100.setFore(fg);
			VT100.setBack(bg);
			VT100.print(ch);
			VT100.reset();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		HashMap<AlphaStat, ArrayList<AlphaStat>> map = new HashMap<>();
		
		int c = 0;
		
		while(true) {
			c++;
			AlphaStat a = new AlphaStat();
			
			if(map.containsKey(a)) {
				//ArrayList<Alpha> list = map.get(a);
				//list.add(a);
				//map.put(a, list);
				map.get(a).add(a);
				
			} else {
				ArrayList<AlphaStat> list = new ArrayList<AlphaStat>();
				list.add(a);
				map.put(a, list);	
			}
			
			if(map.size() == 800)
				break;
		}
		
		VT100.clearScreen();
		
		map.forEach((k, v) -> {
			k.printPosition();
			k.printChar();
			
			v.forEach(a -> {
				a.printChar();
			});
			System.out.println();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		});

		
		
		VT100.reset();
		System.out.println("Program End... count: " + c);
	}
}
