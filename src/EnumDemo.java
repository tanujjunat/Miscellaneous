
public class EnumDemo {
	
	public enum Type {
		HELLO,
		CELLO,
		PRICE_RANGE
		
	}
	
	public static void main(String[] args) {
		System.out.println(Type.PRICE_RANGE.toString().toLowerCase());
	}

}
