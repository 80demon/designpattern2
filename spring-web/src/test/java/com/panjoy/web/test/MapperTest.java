package com.panjoy.web.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.panjoy.web.domain.Orders;
import com.panjoy.web.domain.OrdersCustom;
import com.panjoy.web.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class MapperTest {
	@Autowired
	private OrderService orderService;

	@Test
	public void testSercvice() {
		List<OrdersCustom> cusList = new ArrayList<OrdersCustom>();
		cusList = orderService.findOrdersUser();
		for (Iterator iterator = cusList.iterator(); iterator.hasNext();) {
			OrdersCustom ordersCustom = (OrdersCustom) iterator.next();
			System.out.println(ordersCustom);

		}
		System.out.println(cusList);
	}

	@Test
	public void testResultMap() {
		List<Orders> ordersList = new ArrayList<Orders>();
		ordersList = orderService.findOrdersUserResultMap();
		System.out.println(ordersList);
	}
}
