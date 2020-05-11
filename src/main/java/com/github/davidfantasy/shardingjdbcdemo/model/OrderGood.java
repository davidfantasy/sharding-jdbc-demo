package com.github.davidfantasy.shardingjdbcdemo.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_order_good")
public class OrderGood {

    @TableId
    private Long id;

    private Long orderId;

    private String goodCode;

    private String goodType;

    private String goodSpec;

    private Integer goodQuantity;

    private String orderCode;

}
