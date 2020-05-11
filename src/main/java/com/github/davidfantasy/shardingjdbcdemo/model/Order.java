package com.github.davidfantasy.shardingjdbcdemo.model;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_order")
public class Order {

    @TableId
    private Long id;

    private String orderCode;

    private String productLine;

    private String customerCode;

    private Date createTime;

    private Integer totalQuantity;

}
