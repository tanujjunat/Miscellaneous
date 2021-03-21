import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		
		List<String> data = new ArrayList<>();
		data.add("outdoor");

		System.out.println(String.join(",", data));
	}

}
