package com.github.davidfantasy.shardingjdbcdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.davidfantasy.shardingjdbcdemo.model.OrderGood;

import java.util.List;

public interface OrderGoodMapper extends BaseMapper<OrderGood> {

    public List<OrderGood> getOrderGoods();

}
