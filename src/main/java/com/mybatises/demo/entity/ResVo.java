package com.mybatises.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResVo {
    private Integer size;

    private List<String> cuscodes;

    private String msg;
}
