import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoCon {
	
	
	public static void main(String[] args) {
		DemoCon con = new DemoCon();
		int [] A = {0,5,4,4,5,12};
		System.out.println(con.solution(A));
	}
	
	public int solution(int[] A) {
		
		List<Integer> AList = new ArrayList<Integer>();	
		
		for (int a : A) {
			AList.add(a);
		}
		
		if(AList.size() < 2) 
			return AList.size(); 

	    List<Integer> temp = new LinkedList<>();
	    temp.add(AList.get(0));
	    int start = 0;
	    int end = AList.size();
	    int count = 0;
	    int max = 0;

	    while(start < end) {
	        if(temp.contains(AList.get(start))) {
	            count++;
	            start++;
	        } else if(temp.size() == 1) {
	                temp.add(AList.get(start));
	        } else {  
	                count = 0;
	                start--;
	                temp.set(0, AList.get(start));
	                temp.set(1, AList.get(start + 1));
	        }

	        if(count > max) {
	            max = count;
	        }
	    }
	    return max;
	}
	
	

}
