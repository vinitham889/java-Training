package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>();
		list.add("car");
		list.add("bottle");
		list.add("drink");
		list.add("number");
		list.add("apple");
		System.out.println("Element before sorting....\n"+list);
		Collections.sort(list);
		System.out.println("Element after sorting....\n"+list);
		
	}

}
