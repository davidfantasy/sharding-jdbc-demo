CREATE DATABASE `sharding-db-1` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `t_order_0` (
  `id` bigint(20) NOT NULL,
  `order_code` varchar(32) DEFAULT NULL COMMENT '订单编号',
  `product_line` varchar(12) DEFAULT NULL,
  `customer_code` varchar(32) DEFAULT NULL COMMENT '客户ID',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_1` (
  `id` bigint(20) NOT NULL,
  `order_code` varchar(32) DEFAULT NULL COMMENT '订单编号',
  `product_line` varchar(12) DEFAULT NULL,
  `customer_code` varchar(32) DEFAULT NULL COMMENT '客户ID',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_2` (
  `id` bigint(20) NOT NULL,
  `order_code` varchar(32) DEFAULT NULL COMMENT '订单编号',
  `product_line` varchar(12) DEFAULT NULL,
  `customer_code` varchar(32) DEFAULT NULL COMMENT '客户ID',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_good_1` (
  `id` bigint(20) NOT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `good_code` varchar(32) DEFAULT NULL,
  `good_type` varchar(32) DEFAULT NULL,
  `good_spec` varchar(32) DEFAULT NULL,
  `good_quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_good_2` (
  `id` bigint(20) NOT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `good_code` varchar(32) DEFAULT NULL,
  `good_type` varchar(32) DEFAULT NULL,
  `good_spec` varchar(32) DEFAULT NULL,
  `good_quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_good_3` (
  `id` bigint(20) NOT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `good_code` varchar(32) DEFAULT NULL,
  `good_type` varchar(32) DEFAULT NULL,
  `good_spec` varchar(32) DEFAULT NULL,
  `good_quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
