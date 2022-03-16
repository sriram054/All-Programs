package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
	 
//Method-1
	//	String st="Hyderabad";
	//	int len=st.length();
	//	char[] chArr=st.toCharArray();
	//	for(int i=len-1;i>=0;i--)
	//		System.out.println(chArr[i]);
	
	
//Method-2
	//	String st="Hyderabad";
	//	for(int i=st.length()-1;i>=0;i--)
	//	{
	//		System.out.println(st.charAt(i));
	//	}
	
		
//Method-3
//		String st="Hyderabad";
//		StringBuffer sb=new StringBuffer(st);
//		System.out.println(sb.reverse());
//Method-4
//		String st="Hyderabad";
//		StringBuilder sb=new StringBuilder(st);
//		System.out.println(sb.reverse());
//Method-5
		
		String st="Hyderabad";
		StringBuilder sb=new StringBuilder();
		for(int i=st.length()-1;i>=0;i--)
			sb.append(st.charAt(i));
		System.out.println(sb);
	}

}
