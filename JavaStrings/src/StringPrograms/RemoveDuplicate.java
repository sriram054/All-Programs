package StringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String st="Programming";
		//Method-1
//		StringBuilder sb=new StringBuilder();
//		st.chars().distinct().forEach(c->sb.append((char)c));
//		System.out.println(sb);
		//Method-2
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<st.length();i++)
//		{
//			char ch=st.charAt(i);
//			int idx=st.indexOf(ch,i+1);
//			if(idx==-1)
//				sb.append(ch);
//		}
//		System.out.println(sb);
		//Method-3
		char arr[]=st.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			boolean repeated =false;
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					repeated=true;
					break;
				}
				//System.out.println("Hello");
			}
			if(!repeated)
			{	
				sb.append(arr[i]);
			}
		}
		 
		System.out.println(sb);
		
		// Method-4 
//		StringBuilder sb=new StringBuilder();
//		Set <Character> set=new LinkedHashSet<Character>();
//		for(int i=0;i<st.length();i++)
//		{
//			set.add(st.charAt(i));
//		}
//		for(Character ch:set)
//		{
//			sb.append(ch);
//		}
//		System.out.println(sb);
	}

}
