package com.prashant.study.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {
	private static List<Product> prodList = new ArrayList<Product>();

	static {

		prodList.add(new Product(1, "Laptop", "Lenovo Thinpad"));
		prodList.add(new Product(2, "Laptop", "HP"));
		prodList.add(new Product(3, "Mobile", "Realme"));
		Product myProd=new Product();
		myProd.setName("Desktop");
		myProd.setId(4);
		myProd.setDesc("HP");
		prodList.add(myProd);
		
		
		
	}

	public static List<Product> fetchProduct() {

		return prodList;

	}

	public static Product searchProduct(int id) {

		Optional<Product> prod = prodList.stream().filter(p -> p.getId() == id).findFirst();

		return prod.isPresent() ? prod.get() : null;

	}

}
