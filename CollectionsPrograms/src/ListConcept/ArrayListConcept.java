package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		 ArrayList ar=new ArrayList(); //Non Generic Declaration
		 ar.add(10);
		 ar.add(20);
		 ar.add(30);
		 System.out.println(ar.size());
		 ar.add(40);
		 ar.add(50);
		 System.out.println(ar.size());
		 ar.add(50);
		 System.out.println(ar.size());
		 System.out.println(ar.get(4));
		
		 //non -generic vs generic
		 ar.add(12.33);
		 ar.add(true);
		 ar.add("c");
		 System.out.println("**************");
		 ar.set(0, "a");
		 for(int i=0;i<ar.size();i++)
			 System.out.println(ar.get(i));
		 ArrayList <Integer> ar1=new ArrayList<Integer>(); //Generic Declaration
		 ar1.add(10);
		 //ar1.add("C");  //This will throw an error since ar1 is declared as Generic
		 ArrayList <String> s1=new ArrayList<String>(); //Declaring String ArrayList
		 s1.add("SRIRAM");
		 s1.add("Murthy");
		 //If we are not sure about the data type of data then declare it as E
		 ArrayList <Employee> E1=new ArrayList <Employee>();
		 Employee e1=new Employee("Sriram",27,"IT");
		 Employee e2=new Employee("Murthy",28,"CSE");
		 Employee e3=new Employee("Ithineni",29,"MECH");
		 E1.add(e1);
		 E1.add(e2);
		 E1.add(e3);
		 E1.add(e3);
		 System.out.println(E1.size());
		 //Using Iterator for accessing element in the ArrayList
		 Iterator <Employee> it=E1.iterator();
		 while(it.hasNext())
		 {
			 Employee emp=it.next();
			 System.out.println(emp.name+"\t"+emp.age+"\t"+emp.dept);
		 }
		 ArrayList <String> ar5=new ArrayList <String>();
		 ArrayList <String> ar6=new ArrayList <String>();
		 ar5.add("Sriram");
		 ar5.add("Murthy");
		 ar5.add("ithineni");
		 ar6.add("sukognya");
		 ar6.add("chanamala");
		 ar5.addAll(ar6);
		 for(int i=0;i<ar5.size();i++)
			 System.out.println(ar5.get(i));
		 ar5.removeAll(ar6);
		 for(int i=0;i<ar5.size();i++)
			 System.out.println(ar5.get(i));
		 
		 // Retain all ==> Gives the intersection Elements
		 ArrayList <String> ar7=new ArrayList <String>();
		 ArrayList <String> ar8=new ArrayList <String>();
		 ar7.add("Sriram");
		 ar7.add("Murthy");
		 ar7.add("ithineni");
		 ar8.add("Sriram");
		 ar8.add("chanamala");
		 ar7.retainAll(ar8);
		 System.out.println("**************");
		 for(int i=0;i<ar7.size();i++)
			 System.out.println(ar7.get(i));
	}
}
