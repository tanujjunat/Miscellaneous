import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		String a[] = { "A", "B", "C", "D" };
		
		List<String> st = new ArrayList<>();
		st.add("suspendResume");
		st.add("changeWirelessUserID");
		String one = "changeWirelessUserID";
		if (st.contains(one)) {
			System.out.println("contains " + true);
		} else {
			System.out.println("contains " + false);
		}
		
		List<String> data = new LinkedList<String>(Arrays.asList(a));
		data.add("E");
		System.out.println(data);
		
		boolean boo = true;
		Boolean flush = Boolean.FALSE;
		
		flush = flush || boo;
		System.out.println(flush);
		
		System.out.println("");
		String secretPhrase = "secret$123";
		System.out.println(secretPhrase.getBytes());
		

	}

}
