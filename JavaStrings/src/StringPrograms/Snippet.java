package StringPrograms;

public class Snippet 
{
	public static void main(String[] args) 
	{
		String Input="My name is Sriram Murthy.";
		//String Output="Murthy.My name is Sriram";
		String firstwords=Input.substring(0,Input.lastIndexOf(" "));
		String lastwords=Input.substring(Input.lastIndexOf(" ")+1);
		StringBuilder sb=new StringBuilder();
		sb.append(lastwords);
		sb.append(firstwords);
		System.out.println(sb);
	}
}

