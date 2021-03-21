import java.util.List;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		String [] array = {"a","b","c"};
		List<String> data= List.of(array);
		array[1] = "d";
		System.out.println(data);
		
		Scanner sc = new Scanner(System.in);
		int lsc = sc.nextInt();
		System.out.println(lsc);
		
	}
}


