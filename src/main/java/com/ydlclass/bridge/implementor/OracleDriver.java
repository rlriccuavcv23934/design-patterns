package com.ydlclass.bridge.implementor;

import com.ydlclass.bridge.abstractor.Connection;
import com.ydlclass.bridge.abstractor.Driver;

/**
 * @author it楠老师
 * @createTime 2023-05-24
 */
public class OracleDriver implements Driver {
    @Override
    public Connection connect() {
        return new Connection("Oracle");
    }
}
