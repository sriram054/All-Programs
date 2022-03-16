package StringPrograms;

public class splitfuncDemo {

	public static void main(String[] args) {
		 String st="geekss@for@geekss";
		 String[] arrOfStr=st.split("s", 5);

		 for (String a : arrOfStr)
            System.out.println(a);
	}

}
