package com.github.davidfantasy.shardingjdbcdemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.davidfantasy.shardingjdbcdemo.dao.OrderGoodMapper;
import com.github.davidfantasy.shardingjdbcdemo.model.OrderGood;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderGoodService extends ServiceImpl<OrderGoodMapper, OrderGood> {

    public List<OrderGood> getAllOrderGoods() {
        return this.baseMapper.getOrderGoods();
    }
    
}
