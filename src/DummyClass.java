import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class DummyClass {
	
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		//products.add(new Product());
		//products.add(new Product());
		
		if (CollectionUtils.isEmpty(products)) {
			System.out.println(products);
		}
	}
	
	

}
