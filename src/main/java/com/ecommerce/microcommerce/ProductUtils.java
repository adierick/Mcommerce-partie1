package com.ecommerce.microcommerce;

import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.web.exceptions.ProduitGratuitException;

public class ProductUtils {

	public static void validProduct(Product product) {
		if(product!=null && product.getPrix()==0) {
			throw new ProduitGratuitException("Product can't be free. Please specify the price.");
		}
	}
	
}
