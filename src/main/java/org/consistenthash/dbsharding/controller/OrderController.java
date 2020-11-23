package org.consistenthash.dbsharding.controller;

import lombok.RequiredArgsConstructor;
import org.consistenthash.dbsharding.db.rmdb.entity.Order;
import org.consistenthash.dbsharding.db.rmdb.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@NoArgsConstructor
//@RequiredArgsConstructor
public class OrderController {

    @Autowired
    private final OrderMapper orderMapper;

    public OrderController(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public Order getOrderById(@RequestParam("id") Long id) {
        return orderMapper.selectById(id);
    }

    @RequestMapping(value = "/order/save", method = RequestMethod.POST)
    public int saveOrder(@RequestParam("name") String name, @RequestParam("userid") Long userId) {
        Order order = new Order();
        order.setName(name);
        order.setUserId(userId);
        return orderMapper.insert(order);
    }
}
