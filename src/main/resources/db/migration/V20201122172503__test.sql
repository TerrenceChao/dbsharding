create table t_order0
(
    order_id bigint not null auto_increment primary key,
    user_id bigint not null,
    name varchar(100)
);

create table t_order1
(
    order_id bigint not null auto_increment primary key,
    user_id bigint not null,
    name varchar(100)
);

-- 这是广播表，新建在其中一个节点上就可以
CREATE TABLE `t_config` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `user_id` bigint(20) DEFAULT NULL,
    `config` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB;

CREATE TABLE `t_order_item0` (
    `order_id` bigint(20) NOT NULL,
    `item` varchar(100) DEFAULT NULL,
    `user_id` bigint(20) NOT NULL,
    PRIMARY KEY (`order_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_item1` (
    `order_id` bigint(20) NOT NULL,
    `item` varchar(100) DEFAULT NULL,
    `user_id` bigint(20) NOT NULL,
    PRIMARY KEY (`order_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;