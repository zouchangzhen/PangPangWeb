package com.pangpang.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pangpang.pojo.Orders;
import com.pangpang.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrdersService orderService;

    @RequestMapping("/getOrders/{pageNum}/{pageSize}")
    public PageInfo<Orders> getOrders(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Orders> orders=orderService.getAll();

        PageInfo<Orders> pOrders =  new PageInfo<Orders>(orders);

        return pOrders;
    }

    @RequestMapping("/getOrder")
    public Orders getOrder(Long id) {
        Orders order=orderService.getOne(id);
        return order;
    }

    @RequestMapping("/addOrder")
    public void save(Orders orders) {
        orderService.insert(orders);
    }

    @RequestMapping(value="updateOrder")
    public void update(Orders orders) {
        orderService.update(orders);
    }

    @RequestMapping(value="/deleteOrder/{id}")
    public void delete(@PathVariable("id") Long id) {
        orderService.delete(id);
    }


}
