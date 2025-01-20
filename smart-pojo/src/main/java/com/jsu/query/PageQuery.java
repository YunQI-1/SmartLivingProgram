package com.jsu.query;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

@Data
// 分页查询实体
public class PageQuery {
    private  Integer pageNo = 1;

    private Integer pageSize = 5;

    private String orderBy;

    private Boolean isAsc;

    public <T> Page<T> toMpPage(OrderItem ... items){
        //1.分页条件
        Page<T> page = Page.of(pageNo,pageSize);
        //2.排序条件
        if(StrUtil.isNotBlank(orderBy)){
            page.addOrder(new OrderItem(orderBy,isAsc));
        }else if(items != null && items.length > 0){
            page.addOrder(items);
        }
        return page;
        //
    }

    public <T> Page<T> toMpPage(String defaultSortBy,Boolean defaultAsc){
        return toMpPage(defaultSortBy,defaultAsc);
    }
    public <T> Page<T> toMpPageDefaultSortByCreateTime(){
        return toMpPage("create_time",false);
    }
    public <T> Page<T> toMpPageDefaultSortByUpdateTime(){
        return toMpPage("update_time",false);
    }
}
