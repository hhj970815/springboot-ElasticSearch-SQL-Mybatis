package com.mybatises.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

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

//    private Long phone;
//
//    private String issue_type;
//
//    private Integer orders_times;
//
//    private Double orders_money;
//
//    private String first_order_time;
//
//    private String first_order_platform;
//
//    private String last_order_time;
//
//    private String last_order_platform;
//
//    private Integer drawback_times;
//
//    private String last_highest_sku;
//
//    private Double price;
//
//    private String chronic_sku;
//
//    private Integer chronic_times;
//
//    private Double chronic_money;
//
//    private String chronic_dept;
//
//    private String chronic_last_time;
//
//    private String chronic_first_time;
//
//    private String chronic_pre_time;
//
//    private String cus_active;
//
//    private String cus_type;
//
//    private String cus_val;
//
//    private String cus_ltv;
//
//    private String cus_active_chronic;
//
//    private String cus_type_chronic;
//
//    private String cus_val_chronic;
//
//    private String cus_ltv_chronic;
//
//    private Integer acc_points;
//
//    private Integer sign_times;
//
//    private String last_msgmark_time;
//
//    private Integer mark_times;

//    @Override
//    public String toString() {
//        return "UserTag: {" +
//                "cuscode=" + cuscode +
//                ", is_blank='" + is_blank + '\'' +
//                ", province='" + province + '\'' +
//                ", phone=" + phone +
//                ", issue_type='" + issue_type + '\'' +
//                ", orders_times=" + orders_times +
//                ", orders_money=" + orders_money +
//                ", first_order_time='" + first_order_time + '\'' +
//                ", first_order_platform='" + first_order_platform + '\'' +
//                ", last_order_time='" + last_order_time + '\'' +
//                ", last_order_platform='" + last_order_platform + '\'' +
//                ", drawback_times=" + drawback_times +
//                ", last_highest_sku='" + last_highest_sku + '\'' +
//                ", price=" + price +
//                ", chronic_sku='" + chronic_sku + '\'' +
//                ", chronic_times=" + chronic_times +
//                ", chronic_money=" + chronic_money +
//                ", chronic_dept='" + chronic_dept + '\'' +
//                ", chronic_last_time='" + chronic_last_time + '\'' +
//                ", chronic_first_time='" + chronic_first_time + '\'' +
//                ", chronic_pre_time='" + chronic_pre_time + '\'' +
//                ", cus_active='" + cus_active + '\'' +
//                ", cus_type='" + cus_type + '\'' +
//                ", cus_val='" + cus_val + '\'' +
//                ", cus_ltv='" + cus_ltv + '\'' +
//                ", cus_active_chronic='" + cus_active_chronic + '\'' +
//                ", cus_type_chronic='" + cus_type_chronic + '\'' +
//                ", cus_val_chronic='" + cus_val_chronic + '\'' +
//                ", cus_ltv_chronic='" + cus_ltv_chronic + '\'' +
//                ", acc_points=" + acc_points +
//                ", sign_times=" + sign_times +
//                ", last_msgmark_time='" + last_msgmark_time + '\'' +
//                ", mark_times=" + mark_times +
//                '}';
//    }
}
