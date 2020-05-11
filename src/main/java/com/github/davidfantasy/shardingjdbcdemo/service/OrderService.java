package com.github.davidfantasy.shardingjdbcdemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.davidfantasy.shardingjdbcdemo.dao.OrderMapper;
import com.github.davidfantasy.shardingjdbcdemo.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class OrderService extends ServiceImpl<OrderMapper, Order> {

    @Resource
    private OrderMapper orderMapper;

    public List<Order> sumOrderQuantity() {
        return orderMapper.sumOrderQuantity();
    }

}
