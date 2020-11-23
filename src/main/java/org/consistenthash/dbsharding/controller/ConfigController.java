package org.consistenthash.dbsharding.controller;

import lombok.RequiredArgsConstructor;
import org.consistenthash.dbsharding.db.rmdb.entity.TConfig;
import org.consistenthash.dbsharding.db.rmdb.mapper.TConfigMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
//@RequiredArgsConstructor
public class ConfigController {

    @Resource
    private TConfigMapper tConfigMapper;

    @RequestMapping(value = "/listConfig", method = RequestMethod.GET)
    public List<TConfig> getConfig() {
        return tConfigMapper.selectAll();
    }
}
