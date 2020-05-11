package com.github.davidfantasy.shardingjdbcdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.davidfantasy.shardingjdbcdemo.model.Order;

import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {

    public List<Order> sumOrderQuantity();

}