package Maps;

import java.util.HashMap;
import java.util.Map.Entry;

import Maps.Employee;

public class HashMapConcepts {

	public static void main(String[] args) {
		// HashMap is a class implements Map interface
		//extends AbstractMap
		//It store the data in the form of Key,Value Pair
		// it may have one null key and multiple null values
		// it maintains no order 
		HashMap <Integer, String>hm = new HashMap<Integer,String>();
		hm.put(1,"Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		for(Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
	 
		}
		hm.remove(3);
		for(Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
	
		}
		HashMap<Integer, Employee> emp=new HashMap<Integer,Employee>();
		Employee e1=new Employee("Sriram",27,"IT");
		Employee e2=new Employee("Murthy",28,"CSE");
		Employee e3=new Employee("Ithineni",29,"MECH");
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		//Traversal through the data
		System.out.println("**************");
		for(Entry<Integer,Employee> m:emp.entrySet())
		{
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
	}
}
