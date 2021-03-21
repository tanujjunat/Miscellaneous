import java.util.*;

public class Compare {
	
	public static void main(String[] args) {
		List<String> destinationIds = Arrays.asList("abc", "bcd", "pqr", "str", "xyz");
		
		List<String> sortedProducts1 = Arrays.asList("abc","str","bcd");
		
		sortedProducts1.sort(Comparator.comparingInt(destinationIds::indexOf));
		
		System.out.println(sortedProducts1);
		
		System.out.println("------------------------------------------");		
		
		List<Product> products = new ArrayList<>();
		
		Product product1 = new Product("abc", "abc");
		Product product2 = new Product("str", "str");
		Product product3 = new Product("bcd", "bcd");
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		
		System.out.println("Before Sorting");
		System.out.println(products);
		
		System.out.println("------------------------------------------");
		
		products.stream().forEach(product -> product.getId());	
			
		products.sort(Comparator.comparing( v -> destinationIds.indexOf(v.getId())));
		
		System.out.println("After Sorting");
		System.out.println(products);
	}
	
	
	
	
	
	

}
