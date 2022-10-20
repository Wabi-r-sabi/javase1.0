package com.line.pkg;

import com.line.modifier.Aa;

/**
 * @descriptions: Test
 * @author: 一只强
 * @date: 2022/10/16 13:03
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Aa aa = new Aa();
        //在不同包下,只能访问public修饰的属性或者方法
        System.out.println(aa.n1);
    }
}
