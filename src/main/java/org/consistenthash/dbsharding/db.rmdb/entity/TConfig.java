package org.consistenthash.dbsharding.db.rmdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("t_config")
public class TConfig {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Long userId;

    private String config;

    @Override
    public String toString() {
        return "TConfig{" +
                "id=" + id +
                ", userId=" + userId +
                ", config='" + config + '\'' +
                '}';
    }
}
