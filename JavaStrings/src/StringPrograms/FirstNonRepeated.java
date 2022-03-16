package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeated {

	public static void main(String[] args) {
		String st="Programming";
		//Without Using Collections
//		
//		
//		for(int i=0;i<st.length();i++)
//		{ 
//			boolean unique=true;
//			for(int j=i+1;j<st.length();j++)
//			{
//				if (st.charAt(i)==st.charAt(j))
//					unique=false;
//			}
//			if(unique)
//			{
//				System.out.println(st.charAt(i));
//				break;
//			}
//		}
		
		//With Using Collections
		Map<Character,Integer> map=new HashMap();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
			
		}
		 
		System.out.println(map);
		for(Entry <Character,Integer> entry :map.entrySet())
		{
			if(entry.getValue()==1)
				System.out.println(entry.getKey());
				
		}
	}
}
