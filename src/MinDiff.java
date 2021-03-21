import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MinDiff {

	

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 4, 7, 9, 2, 23, 25, 41,30, 40, 28, 42, 30, 44, 48,43, 50);
		Collections.sort(list);
		System.out.println(list);
		int maxMin = 0;
		int min;
		int num=7;
		for (int i=0;i<list.size()-num+1;i++) {
			
			min = list.get(i+num-1)-list.get(i);
			if (i==0) {
				maxMin = min;
			}
			
			if (min < maxMin) {
				maxMin = min;
			}
		}
		System.out.println(maxMin);
	}
}
