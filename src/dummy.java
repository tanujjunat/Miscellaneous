import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class dummy {
	public static void main(String[] args) {
		if (true && false || true && false) {
			System.out.println("hey");
		}
		
		Boolean ab = Boolean.valueOf("");
		System.out.println(ab);
		System.out.println("hey " + null);
		
		List<String> phones = new ArrayList<>();
		phones.add("123");
		phones.add(" ");
		phones.add("last");
		for (String phone : phones) {
			System.out.println("phone :" + phone + ";");
		}
		
		Locale locale = Locale.US;
		Object object = locale;
		String stringLocale = (String) object;
		System.out.println(stringLocale);
	}

}
