package com.mybatises.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String user_num;
    private String mobile;
    private String reg_date;
    private String dt;

    @Override
    public String toString() {
        return "Person{" +
                "user_num='" + user_num + '\'' +
                ", mobile='" + mobile + '\'' +
                ", reg_date='" + reg_date + '\'' +
                ", dt='" + dt + '\'' +
                '}';
    }
}
