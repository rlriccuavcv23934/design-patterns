package com.ydlclass.adapter.classType;

import java.util.List;

/**
 * @author it楠老师
 * @createTime 2023-05-24
 */
public class Main {

    public static void main(String[] args) {
        List<Target> targets = List.of(
                new ClassAdapter(),new ClassAdapterTwo()
        );
        for (Target target : targets) {
            target.request();
        }
    }

}
