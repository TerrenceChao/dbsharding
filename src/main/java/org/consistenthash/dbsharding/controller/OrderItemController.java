package org.consistenthash.dbsharding.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.consistenthash.dbsharding.db.rmdb.entity.OrderItem;
import org.consistenthash.dbsharding.db.rmdb.mapper.OrderItemMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
//@NoArgsConstructor
//@RequiredArgsConstructor
public class OrderItemController {

    @Resource
    private OrderItemMapper orderItemMapper;

    @RequestMapping(value = "/orderItem", method = RequestMethod.GET)
    public OrderItem getOrderItemById(@RequestParam(name = "id") Long id) {
        return orderItemMapper.selectById(id);
    }

    @RequestMapping(value = "/orderItem/save", method = RequestMethod.POST)
    public int saveOrderItem(@RequestParam("item") String item, @RequestParam("userid") Long userId, @RequestParam("orderid") Long orderId) {
        OrderItem orderItem = new OrderItem();
        orderItem.setUserId(userId);
        orderItem.setItem(item);
        orderItem.setOrderId(orderId);
        return orderItemMapper.insert(orderItem);
    }

    @RequestMapping(value = "/orderItem/query", method = RequestMethod.GET)
    public OrderItem getOrderItemByOrderId(@RequestParam(name = "orderid") Long orderId) {
        return orderItemMapper.selectById(orderId);
    }
}
