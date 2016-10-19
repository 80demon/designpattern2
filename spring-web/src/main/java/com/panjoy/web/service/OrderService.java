package com.panjoy.web.service;

import java.util.List;

import com.panjoy.web.domain.Orders;
import com.panjoy.web.domain.OrdersCustom;

public interface OrderService {
	public List<OrdersCustom> findOrdersUser();

	public List<Orders> findOrdersUserResultMap();
}
