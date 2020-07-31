package com.udacity.pricing;

import com.udacity.pricing.api.PricingController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceApplicationTests {
	@Autowired
	private PricingController pricingController;
	@Test
	public void contextLoads() {
	}
	@Test
	public void getPrice() throws Exception{

	}

}
