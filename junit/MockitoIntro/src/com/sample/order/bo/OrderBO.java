package com.sample.order.bo;

import com.sample.order.bo.exception.BOException;
import com.sample.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
