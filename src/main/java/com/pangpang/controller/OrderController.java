package com.pangpang.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pangpang.pojo.Orders;
import com.pangpang.service.OrdersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OrdersService orderService;

    @RequestMapping(value = "/getOrders/{pageNum}/{pageSize}",method = RequestMethod.GET)
    public PageInfo<Orders> getOrders(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize,String buyer,String date) {
        logger.info("请求");
        PageHelper.startPage(pageNum,pageSize);
        List<Orders> orders=orderService.getAll();

        PageInfo<Orders> pOrders =  new PageInfo<Orders>(orders);

        return pOrders;
    }

    @RequestMapping(value = "/getOrder",method = RequestMethod.GET)
    public Orders getOrder(Long id) {
        logger.info("请求");
        Orders order=orderService.getOne(id);
        return order;
    }

    @RequestMapping(value = "/addOrder",method = RequestMethod.GET)
    public void save(Orders orders) {

        logger.info("请求");
        orderService.insert(orders);
    }

    @RequestMapping(value="updateOrder",method = RequestMethod.GET)
    public void update(Orders orders) {

        logger.info("请求");
        orderService.update(orders);
    }

    @RequestMapping(value="/deleteOrder/{id}",method = RequestMethod.GET)
    public void delete(@PathVariable("id") Long id) {
        logger.info("请求");
        orderService.delete(id);
    }


}
