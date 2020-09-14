package com.mybatises.demo.dao.impala;

import com.mybatises.demo.entity.Person;

import java.util.List;

public interface PersonMapper {
    List<Person> queryAll();
}
