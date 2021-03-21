import java.util.Arrays;
import java.util.List;

public class StringAppend {
	
	public static void main(String[] args) {
		
		List<String> blockNumberList = Arrays.asList("a","b","c");
		StringBuilder output = new StringBuilder();
		int pipecount = 0;
		for (String blockNumber : blockNumberList) {
			output.append(blockNumber);
			if (pipecount < 4) {
				output.append("|");
			}
			pipecount++;
		}
		for (int i = pipecount; i<4; i++) {
			output.append("|");
		}
		
		System.out.println(output.toString());
	}

}
