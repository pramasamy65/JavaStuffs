package com.handson.java.designpatterns.dynamicproxy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		
		Map < String, List < String >> phoneNumbers = new HashMap < String, List < String >> ();
		phoneNumbers.put("John Lawson", Arrays.asList("3232312323", "8933555472"));
		phoneNumbers.put("Mary Jane", Arrays.asList("12323344", "492648333"));
		phoneNumbers.put("Mary Lou", Arrays.asList("77323344", "938448333"));

		for(Map.Entry<String, List < String >> ma: phoneNumbers.entrySet()) {
			
		}
		
	}
}
