package com.panjoy.web.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.panjoy.web.domain.OrdersCustom;
@Repository("ordersCustomMapper")
public interface OrdersCustomMapper {
	/** 查询订单，关联查询用户信息 */
	public List<OrdersCustom> findOrdersUser();

}
