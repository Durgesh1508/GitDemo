package implementation;

import java.util.List;

public class Search {
	
	public List<String> displayProduct(Product product) {
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductList();
		}
		return null;
	}

}
