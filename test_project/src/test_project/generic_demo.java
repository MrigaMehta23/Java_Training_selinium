package test_project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class generic_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> values=new ArrayList<Integer>();
		values.add(5);
		values.add(6);
		
		Iterator i= values.iterator();
		while(i.hasNext()){  
			System.out.println(i.next());  
			}  
	}

}
