package com.line.modifier;

/**
 * @descriptions: Bb
 * @author: 一只强
 * @date: 2022/10/16 12:48
 * @version: 1.0
 */
public class Bb {
    public void say() {
        Aa aa = new Aa();
        //在同一个包下,可以访问public,protected,和默认,不能访问private属性
        System.out.println("n1=" + aa.n1 + "n2=" + aa.n2 + "n3=" + aa.n3);
    }
}
