package com.prashant.study.test;

import org.junit.Test;

import com.prashant.study.web.LoginService;

import junit.framework.Assert;

public class LoginTest {
	
	@Test
	public void init() {
		Assert.assertEquals(1, 1);
	}

	@Test
	public void testLogin() {
		Assert.assertTrue(LoginService.doLogin());
	}
	
}
