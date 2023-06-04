package com.ydlclass.proxy.dynamicProxy.cglib;

/**
 * @author it楠老师
 * @createTime 2023-05-17
 */
public class DatabaseDataQuery {

    public String query(String queryKey) {
        // 他会使用数据源从数据库查询数据很慢
        System.out.println("正在从数据库查询数据");
        return "result";
    }

    public String queryAll(String queryKey) {
        // 他会使用数据源从数据库查询数据很慢
        System.out.println("正在从数据库查询数据");
        return "all result";
    }
}
