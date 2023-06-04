package com.ydlclass.command.editor;

/**
 * @author it楠老师
 * @createTime 2023-06-04
 */
public interface Command {

    void execute();

    /**
     * 撤销的功能
     */
    void undo();

}
