package br.com.fluentcode.jenkins;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {
	
	@Test
	public void test(){
		Assert.assertEquals("Hello World!", App.getMessage());
	}
}
