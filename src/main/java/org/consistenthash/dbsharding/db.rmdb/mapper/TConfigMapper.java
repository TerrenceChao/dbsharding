package org.consistenthash.dbsharding.db.rmdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.consistenthash.dbsharding.db.rmdb.entity.TConfig;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TConfigMapper extends BaseMapper<TConfig> {
    List<TConfig> selectAll();
}
