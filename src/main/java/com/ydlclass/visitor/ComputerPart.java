package com.ydlclass.visitor;

/**
 * 被访问的组件
 * @author it楠老师
 * @createTime 2023-06-03
 */
public interface ComputerPart {

    void accept(ComputerVisitor computerVisitor);

}
