
package com.prev;
import java.util.*;
public class hashMap {
 public static void main(String args[]) {
	 HashMap<String,Integer> hm = new HashMap<>();
	 hm.put("India", 100);
	 hm.put("China", 50);
	 hm.put("US", 25);
	 System.out.println(hm);
	int population = hm.get("India");
	System.out.println(population);
	System.out.println(hm.containsKey("India"));
	System.out.println(hm.remove("China"));     //returns value
	System.out.println(hm);
	System.out.println(hm.size());
	//hm.clear();
	//System.out.print(hm.isEmpty());
	Set<String> keys = hm.keySet();
	System.out.println(keys);
	for(String k : keys) {
		System.out.println("key = " + k + ",value=" + hm.get(k));
	}
 }
}
