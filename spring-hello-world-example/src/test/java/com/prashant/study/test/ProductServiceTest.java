package com.prashant.study.test;

import org.junit.Test;

import com.prashant.study.web.LoginService;
import com.prashant.study.web.Product;
import com.prashant.study.web.ProductService;

import junit.framework.Assert;

public class ProductServiceTest {
	
	@Test
	public void init() {
		Assert.assertEquals(1, 1);
	}

	@Test
	public void testProductList() {
		Assert.assertTrue(ProductService.fetchProduct().size()>0);
	}
	
	
	@Test
	public void testProductSearch() {
		
	Product prod=ProductService.searchProduct(1);
		
		Assert.assertNotSame(prod, null);
		
		System.out.println(prod.getId()+", "+prod.getName()+", "+prod.getDesc());
	}
	
	
}
