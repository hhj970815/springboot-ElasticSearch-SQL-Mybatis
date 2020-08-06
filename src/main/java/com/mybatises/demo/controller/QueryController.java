package com.mybatises.demo.controller;

import com.mybatises.demo.entity.UserTag;
import com.mybatises.demo.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    QueryService queryService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String queryByCuscode(UserTag userTag) {
        return queryService.queryByCuscode(userTag).toString();
    }

    // 接受post请求可在参数里面添加method = RequestMethod.POST 这样就不需要再在参数前面加@RequestBody注解
    @RequestMapping(value = "/province", method = RequestMethod.POST)
    public String queryByProvince(String province) {
        Map<Integer, List<String>> map = new HashMap<>();
        int size = queryService.queryByProvince(province).size();
        System.out.println(size);
        List<String> strings = queryService.queryByProvince(province);
        map.put(size, strings);
        return map.toString();
    }

    @RequestMapping(value = "/count", method = RequestMethod.POST)
    public Long queryCount(UserTag userTag) {

        return queryService.queryCount(userTag);
    }


}
