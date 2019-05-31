package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionsMap {

	public static void main(String[] args) {

		learnMap();
	}
	public static void learnMap()
	{
		String name = "ameex";
		char[] array = name.toCharArray();	
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char eachchar : array)
		{
			if(map.containsKey(eachchar))
			{
				map.put(eachchar, map.get(eachchar)+1);
			}
			else
			{
				map.put(eachchar, 1);
			}
		}
		System.out.println(map);
	}
}