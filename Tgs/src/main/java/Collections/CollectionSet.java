package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {

		learnList();
	}
	public static void learnList()
	{	
		List<String> st = new ArrayList<>();
		//Set<String> st = new HashSet<>();
		//Set<String> st = new HashSet<>();
		st.add("sekar");
		st.add("sai");
		st.add("sandy");
		st.add("sam");
		st.add("gowri");
		st.add("Sam");
		st.add("sam");

		for (String string : st) {
			System.out.println("" +string);
		}
		//Collections.sort(st);
		System.out.println(st);


		//		for (String s : st) {
		//			
		//			System.out.println("starts with s " +s.toString().charAt(0) == "s");
		//		}

		st.remove("sam");
		System.out.println("" +st.contains("sam"));

		st.clear();
		System.out.println("isempty " +st.isEmpty());

		List<String> ls = new ArrayList<>();
		ls.addAll(ls);
		Collections.sort(ls);
		System.out.println(ls);
		


	}
}
