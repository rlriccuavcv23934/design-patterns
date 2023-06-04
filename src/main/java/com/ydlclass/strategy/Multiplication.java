package com.ydlclass.strategy;

/**
 * @author it楠老师
 * @createTime 2023-06-01
 */
public class Multiplication implements Operation{
    @Override
    public double execute(double num1, double num2) {
        return num1 * num2;
    }
}
