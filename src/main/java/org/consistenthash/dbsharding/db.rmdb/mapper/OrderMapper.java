package org.consistenthash.dbsharding.db.rmdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.consistenthash.dbsharding.db.rmdb.entity.Order;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderMapper extends BaseMapper<Order> {
}
