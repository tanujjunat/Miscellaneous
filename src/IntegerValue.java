import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class IntegerValue {

	public static void main(String[] args) {
		List<Integer> ranked = Arrays.asList(100,90,90,80,75,60);
		List<Integer> player = Arrays.asList(50,65,77,90,102);
		
		List<Integer> result = new ArrayList<>();
		
		
		
		List<Integer> distinctRank = new ArrayList<>();
		for (int i=0; i<ranked.size();i++) {
			if(i == 0) {
				distinctRank.add(ranked.get(i));
			} else if (ranked.get(i-1) != ranked.get(i)) {
				distinctRank.add(ranked.get(i));
			}					
		}
		System.out.println(distinctRank);
		
		for (int i = 0; i < player.size(); i++) {
			int index = 0;
			if (i==0) {
				index= getIndex(distinctRank, player.get(i), 0, distinctRank.size()-1, 0);
			} else {
				index = getIndex(distinctRank, player.get(i), 0, result.get(i-1)-1 < distinctRank.size() ? result.get(i-1)-1: result.get(i-1)-2, 0);
			}
			 
			result.add(index);
		}
		
		
        /*TreeSet<Integer> rankedSet = new TreeSet<>(ranked);
        for (Integer play : player) {                      
            rankedSet.add(play);
            result.add(getRank(rankedSet, play));
            rankedSet.remove(play);
        }	*/
        System.out.println(result);
	}
	
	private static Integer getIndex(List<Integer> distinctRank, Integer play, int start, int end, int ind) {
		//Integer rank = end;
		if (start <= end) {
			int index = (start + end)/2;
			if(distinctRank.get(distinctRank.size()-1)> play) {
				return distinctRank.size() +1;
			}
	        if (distinctRank.get(index) == play) {
	        	return index+1;
	        }
	        if (distinctRank.get(index) > play) {
	        	return getIndex(distinctRank, play, index+1, end, index+1);
	        }
	        if (distinctRank.get(index) < play) {
	        	return getIndex(distinctRank, play, start, index-1, index+1);
	        }
		}       
        return ind;
    }
	

	private static Integer getRank(TreeSet<Integer> combinedRankSet, Integer play) {
        List<Integer> combinedRank = new LinkedList<>(combinedRankSet);
        return combinedRank.size() - combinedRank.indexOf(play);
    }
}
