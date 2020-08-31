package com.mybatises.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author huanghuajie
 * 封装前端过来的数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "tag_customer_wide_es")
public class UserTag {

    // 用户编号
//    @Id
    private String cuscode;

    // 系统黑名单
    private String is_blank;

    // 地区-省
    private String province;

    // 手机号码
    private Long phone;

    // 疾病类型
    private String issue_type;

    private Integer orders_times;

    private Double orders_money;

    // 首次下单时间
    private String first_order_time;

    private String first_order_time_begin;

    private String first_order_time_end;

    private String first_order_platform;

    // 最近一次下订单时间
    private String last_order_time;

    private String last_order_time_begin;

    private String last_order_time_end;

    private String last_order_platform;

    private Integer drawback_times;

    private String last_highest_sku;

    private Double price;

    private String chronic_sku;

    private Integer chronic_times;

    private Double chronic_money;

    private String chronic_dept;

    // 最近一次购买时间--慢病
    private String chronic_last_time;

    private String chronic_last_time_begin;

    private String chronic_last_time_end;

    // 首次购买时间--慢病
    private String chronic_first_time;

    private String chronic_first_time_begin;

    private String chronic_first_time_end;

    // 预计购买时间--慢病
    private String chronic_pre_time;

    private String chronic_pre_time_begin;

    private String chronic_pre_time_end;

    private String cus_active;

    private String cus_type;

    private String cus_val;

    private String cus_ltv;

    private String cus_active_chronic;

    private String cus_type_chronic;

    private String cus_val_chronic;

    private String cus_ltv_chronic;

    private Integer acc_points;

    private Integer sign_times;

    // 最近一次营销时间
    private String last_msgmark_time;

    private String last_msgmark_time_begin;

    private String last_msgmark_time_end;

    private Integer mark_times;
}
