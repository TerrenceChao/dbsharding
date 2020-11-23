package org.consistenthash.dbsharding.db.rmdb.algo;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

public class PreciseShardingAlgorithmImpl implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
        String dbName = "ds";
        Long val = shardingValue.getValue();
        dbName += val;
        for (String each : availableTargetNames) {
            if (each.equals(dbName)) {
                return each;
            }
        }
        throw new IllegalArgumentException();
    }
}
