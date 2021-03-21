import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaExample {
	
	public static void main(String[] args) {
		
		
		Map<String, List<String>> st = new HashMap<>();
		st.put("1", Arrays.asList("a","b"));
		st.put("2", Arrays.asList("c","d","e"));
		st.put("3", Arrays.asList("f"));
		st.put("4", Arrays.asList("g","h"));
		
		
		int details = st.values()
				.stream()
				.map(mtnList -> mtnList.size())
				.max(Integer::compare)
				.get();
		
		System.out.println(details);
	}
	
	

}
