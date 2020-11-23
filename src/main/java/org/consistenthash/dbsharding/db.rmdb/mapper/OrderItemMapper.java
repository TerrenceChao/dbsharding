package org.consistenthash.dbsharding.db.rmdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.consistenthash.dbsharding.db.rmdb.entity.OrderItem;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Mapper
@Repository
public interface OrderItemMapper extends BaseMapper<OrderItem> {
    Optional<OrderItem> getOrderItemByOrderId(@Param("orderId") Long orderId);
}
