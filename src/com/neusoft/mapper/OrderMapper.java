package com.neusoft.mapper;

import java.util.Date;
import java.util.List;

import com.neusoft.po.Order;
import com.neusoft.vo.OrderVo;


//log 7.2:�˿����״̬������
public interface OrderMapper {

	public List<Order> findAllOrder() throws Exception;
	public List<Order> findOrder(OrderVo vo) throws Exception;
	public boolean updateOrder(OrderVo vo) throws Exception;

}
