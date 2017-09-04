package com.pangpang.service;

import com.pangpang.pojo.Orders;

import java.util.List;

/**
 * Created by Administrator on 2017/9/4.
 */
public interface OrdersService {

    List<Orders> getAll();

    Orders getOne(Long id);

    void insert(Orders  order);

    void update(Orders  order);

    void delete(Long id);
}
