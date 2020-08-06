package com.mybatises.demo.service;

import com.mybatises.demo.dao.es.RwTradeMapper;
import com.mybatises.demo.entity.UserTag;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QueryService {

    @Resource
    RwTradeMapper rwTradeMapper;

    public List<String> queryByCuscode(UserTag userTag) {
        return rwTradeMapper.queryByCuscode(userTag);
    }

    public List<String> queryByProvince(String province) {
        return rwTradeMapper.queryByProvince(province);
    }

    public Long queryCount(UserTag userTag) {
        return rwTradeMapper.queryCount(userTag);
    }
}
