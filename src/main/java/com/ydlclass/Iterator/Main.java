package com.ydlclass.Iterator;

/**
 * @author it楠老师
 * @createTime 2023-06-03
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,3,1,6,5,9};
        IntArray intArray = new IntArray(nums);

        // 使用迭代器进行迭代
        Iterator iterator = intArray.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
