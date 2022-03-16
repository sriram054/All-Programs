package StringsConcepts;

import java.util.ArrayList;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		 String s1="Hyderabad";
		 char s[]=s1.toCharArray();
		 int len=s1.length();
		 removeDup(s1,len);
	}
	private static void removeDup(String s1,int len) 
	{
		ArrayList <Character> newlist=new ArrayList<Character>();
		for(int i=0;i<len;i++)
		{	char ch=s1.charAt(i);
			if(!newlist.contains(ch))
				newlist.add(ch);
		}
		for(int i=0;i<newlist.size();i++)
		{
			System.out.println(newlist.get(i));
		}
	}
}
