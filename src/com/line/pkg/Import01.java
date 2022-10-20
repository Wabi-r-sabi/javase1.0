package com.line.pkg;

import java.util.Arrays;

/**
 * @descriptions: Import
 * @author: 一只强
 * @date: 2022/10/16 11:52
 * @version: 1.0
 */
public class Import {
    public static void main(String[] args) {
        //使用系统提供Arrays完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }
    }
}
