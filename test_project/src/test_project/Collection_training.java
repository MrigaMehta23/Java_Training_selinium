package test_project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Collection_training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		values.add(5);
		values.add(6);
		
		Iterator i= values.iterator();
		while(i.hasNext()){  
			System.out.println(i.next());  
			}  
		
		 
	}

}
