package example;

import java.util.List;
import java.util.ArrayList;

public class ArrayExm {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("Javascript");
		list.add("CSS");
		list.add("HTML");
		List<String> result = new ArrayList<>();
		for(String s : list)
		{
			if(s.contains("CSS"))
				result.add(s);
		}
		System.out.println(result);
	}
}

	