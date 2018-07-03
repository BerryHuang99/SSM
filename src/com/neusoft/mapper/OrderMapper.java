package com.neusoft.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.neusoft.po.Order;

public interface OrderMapper {

	public List<Order> findAllOrder() throws Exception;
	public List<Order> findOrder(Map map) throws Exception;  //������ѯ �˿�� ��������
	public int updateOrder(Order order) throws Exception;

}