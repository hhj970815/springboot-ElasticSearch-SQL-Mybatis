package com.mybatises.demo.controller;

import com.mybatises.demo.entity.Person;
import com.mybatises.demo.entity.ResVo;
import com.mybatises.demo.entity.UserTag;
import com.mybatises.demo.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResVo queryByProvince(String province) {
        ResVo resVo = new ResVo();
        List<String> provinces = queryService.queryByProvince(province);
        int size = provinces.size();
        resVo.setSize(size);
        resVo.setCuscodes(provinces);
        resVo.setMsg("200 OK!");

        return resVo;
    }

    @RequestMapping(value = "/count", method = RequestMethod.POST)
    public Long queryCount(UserTag userTag) {
        return queryService.queryCount(userTag);
    }

    @RequestMapping(value = "/impala", method = RequestMethod.GET)
    public List<Person> queryAll(){
        return queryService.queryAll();
    }
}
