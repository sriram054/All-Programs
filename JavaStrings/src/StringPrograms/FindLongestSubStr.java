package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubStr {

	public static void main(String[] args) {
		 lengthofLongestSubString("abcbbabc");
	}

	private static void lengthofLongestSubString(String st ) {
		String longestsubstring = null;
		int lenoflongestsubstring = 0;
		Map<Character, Integer> map= new LinkedHashMap<Character,Integer>();
		char [] arr= st.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}
			else
			{
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>lenoflongestsubstring)
			{
				longestsubstring=map.keySet().toString();
				lenoflongestsubstring=map.size();
			}
		}
		System.out.println(longestsubstring);
		System.out.println(lenoflongestsubstring);
		
	}

}
