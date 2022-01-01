package test_project;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class mapinterface_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>obj= new HashMap<>();
		obj.put("name","mriga");
		obj.put("designation","PA");
		obj.put("dob", "23/08/98");
		System.out.println(obj);
		System.out.println("printing in sequeance");
		
		Set<String>  keys= obj.keySet();  //(keyset gets you key value)
		
		for(String key:keys)
		{
		System.out.println(key+ " " +obj.get(key));
	}
	}

}
