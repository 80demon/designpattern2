package com.panjoy.web.service;

import java.util.List;

import com.panjoy.web.domain.OrdersCustom;

public interface OrderService {
	public List<OrdersCustom> findOrdersUser();
}
