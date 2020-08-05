package com.mybatises.demo.controller;

import com.mybatises.demo.entity.UserTag;
import com.mybatises.demo.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    QueryService queryService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String queryByCuscode(UserTag userTag) {
        return queryService.queryByCuscode(userTag).toString();
    }

    @RequestMapping(value = "/province", method = RequestMethod.POST)
    public String queryByProvince(String province) {
        return queryService.queryByProvince(province).toString();
    }
}
