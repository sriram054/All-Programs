package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept 
{
	public static void main(String[] args) 
	{
		 LinkedList <String> ll=new LinkedList<String>();
		 ll.add("test");
		 ll.add("qtp");
		 ll.add("selenium");
		 System.out.println(ll);
		 // add first and last elements to the linked list
		 ll.addFirst("Sriram");
		 ll.addLast("Murthy");
		 System.out.println(ll);
		 //get the element
		 System.out.println(ll.get(0));
		 
		 // set the element
		 ll.set(0, "Happy");
		 System.out.println(ll);
		 //remove first and last elements to the linked list
		 ll.removeFirst();
		 ll.removeLast();
		 System.out.println("**************");
		 
		 System.out.println(ll);
		 ll.remove(2);
		 
		 System.out.println("**************");
		 
		 System.out.println(ll);
		 System.out.println("**************");
		 
		 System.out.println("Using For Loop");
		 for(int i=0;i<ll.size();i++)
			 System.out.println(ll.get(i));
		 System.out.println("**************");
		 
		 System.out.println("Using Advanced For Loop");
		 for(String st:ll)
		 {
			 System.out.println(st );
		 }
		 Iterator <String> it=ll.iterator();
		 System.out.println("**************");
		 
		 System.out.println("Using Iterator");	
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 int num=0;
		 System.out.println("**************");
		 
		 System.out.println("Using While Loop");
		 while(ll.size()>num)
		 {
			 System.out.println(ll.get(num));
			 num++;
		 }
	}
}
