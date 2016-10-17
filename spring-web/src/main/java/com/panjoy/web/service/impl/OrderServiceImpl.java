package com.panjoy.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panjoy.web.dao.OrdersCustomMapper;
import com.panjoy.web.domain.OrdersCustom;
import com.panjoy.web.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrdersCustomMapper ordersCustomMapper;

	@Override
	public List<OrdersCustom> findOrdersUser() {
		// TODO Auto-generated method stub
		return ordersCustomMapper.findOrdersUser();
	}

}
