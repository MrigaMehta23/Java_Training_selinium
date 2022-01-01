package test_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> value= new ArrayList<Integer>();
		value.add(2);
		value.add(3);
		value.add(4);
		
		value.add(1,5);
		for(int i :value)
		{
			System.out.println(i);
		}
		Collections.sort(value);
		System.out.println("*******************");
		System.out.println("Sorted liST");
		for(int i :value)
		{
			System.out.print(i);
		}
	}

}
