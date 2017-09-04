package com.pangpang.service.impl;

import com.pangpang.mapper.OrdersMapper;
import com.pangpang.pojo.Orders;
import com.pangpang.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/4.
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> getAll() {
        return ordersMapper.getAll();
    }

    @Override
    public Orders getOne(Long id) {
        return ordersMapper.getOne(id);
    }

    @Override
    public void insert(Orders order) {
        ordersMapper.insert(order);
    }

    @Override
    public void update(Orders order) {
        ordersMapper.update(order);
    }

    @Override
    public void delete(Long id) {
        ordersMapper.delete(id);
    }
}
