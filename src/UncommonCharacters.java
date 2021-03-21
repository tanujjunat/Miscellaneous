import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UncommonCharacters {
	
	public static void main(String[] args) {
		String A = "abababcdefababcdab";
		String B = "geeksforgeeks";
		String C = A+B;
		Map<String, Integer> frequency = new HashMap<>();
		String output = null;
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < B.length(); i++) {
			String charString = String.valueOf(B.charAt(i));
			
			if (frequency.containsKey(charString)) {
				if (maxCount < count) {
					maxCount = count;
					
				}
				count = 0;
				frequency.clear();
				//output = charString;
				
			} else {
				frequency.put(charString, 1);
				count++;
			}			
		}
		
		System.out.println(maxCount);
		
	}

}
