package com.mybatises.demo.utils;

import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
public class ListPageUtil<T> {
    private List<T> data;

    /** 上一页 */
    private int lastPage;

    /** 当前页 */
    private int currentPage;

    /** 下一页 */
    private int nextPage;
//
    /** 每页条数 */
    private int pageSize;

    /** 总页数 */
    private int totalPage;

    /** 总数据条数 */
    private int totalCount;

    public List<T> getData() {
        int fromIndex = (currentPage - 1) * pageSize;
        if (fromIndex >= data.size()) {
            return Collections.emptyList();//空数组
        }
        if(fromIndex<0){
            return Collections.emptyList();//空数组
        }
        int toIndex = currentPage * pageSize;
        if (toIndex >= data.size()) {
            toIndex = data.size();
        }
        return data.subList(fromIndex, toIndex);
    }
}
