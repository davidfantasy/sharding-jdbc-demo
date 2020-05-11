package com.github.davidfantasy.shardingjdbcdemo;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.RandomUtil;
import com.github.davidfantasy.shardingjdbcdemo.model.Order;
import com.github.davidfantasy.shardingjdbcdemo.model.OrderGood;
import com.github.davidfantasy.shardingjdbcdemo.service.OrderGoodService;
import com.github.davidfantasy.shardingjdbcdemo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = ShardingTableDemoApplication.class)
@Transactional
@Rollback(false)
@Slf4j
public class TestShardingDb {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderGoodService orderGoodService;

    @Test
    public void testCreateOrder() throws Exception {
        List<String> productLines = ListUtil.toList("TC", "UB");
        List<Order> newOrders = new ArrayList<>();
        List<OrderGood> newOrderGoods = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Order order = new Order();
            order.setOrderCode(System.currentTimeMillis() + RandomUtil.randomString(6));
            order.setCreateTime(new Date());
            order.setProductLine(productLines.get(RandomUtil.randomInt(0, 2)));
            newOrders.add(order);
        }
        orderService.saveBatch(newOrders);
        for (Order order : newOrders) {
            OrderGood aGood = new OrderGood();
            aGood.setOrderId(order.getId());
            aGood.setGoodCode(RandomUtil.randomString(6));
            aGood.setGoodQuantity(RandomUtil.randomInt(1, 200));
            newOrderGoods.add(aGood);
        }
        orderGoodService.saveBatch(newOrderGoods);
    }

    @Test
    public void testJoin() throws Exception {
        List<OrderGood> goods = orderGoodService.getAllOrderGoods();
        for (OrderGood good : goods) {
            log.info("orderId:{},orderCode:{}", good.getOrderId(), good.getOrderCode());
        }
    }

    @Test
    public void testGroup() throws Exception {
        List<Order> orders = orderService.sumOrderQuantity();
        for (Order order : orders) {
            log.info("code:{},quantity:{}", order.getOrderCode(), order.getTotalQuantity());
        }
    }


}
