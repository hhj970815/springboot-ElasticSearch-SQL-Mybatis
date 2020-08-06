package com.mybatises.demo.dao.es;

import com.mybatises.demo.entity.UserTag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface RwTradeMapper {
    String testSql();

    List<String> queryByCuscode(UserTag userTag);

    List<String> queryByProvince(String province);

    Long queryCount(UserTag userTag);
}
