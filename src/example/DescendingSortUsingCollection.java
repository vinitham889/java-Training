package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingSortUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("car");
		list.add("bottle");
		list.add("drink");
		list.add("number");
		list.add("apple");
		System.out.println("Elements before sorting..."+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Elements after sorting..."+list);

	}

}
