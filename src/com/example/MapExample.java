package com.example;

import java.util.HashMap;
import java.util.Random;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		Random r = new Random();
		int c = 0;
		
		while(true) {
			char ch = (char) r.nextInt('A', 'Z'+1);
			c++;
			
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, ++count);
			} else {
				map.put(ch, 1);
			}
			
			if(map.size() == 26)
				break;
		}
		System.out.println(map);
		System.out.println(c);
	}
}
