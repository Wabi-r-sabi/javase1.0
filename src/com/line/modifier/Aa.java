package com.line.modifier;

/**
 * @descriptions: Aa
 * @author: 一只强
 * @date: 2022/10/16 12:04
 * @version: 1.0
 */
public class Aa {
        //四个属性,分别使用不同的访问修饰符

        public int n1 = 100;
        protected int n2 = 200;
        int n3 = 300;
        private int n4 = 400;
        public void test () {
            //在同一个类中,可以访问四个属性
                System.out.println(("n1=" + n1 + "n2=" + n2 + "n3=" + n3 + "n4=" + n4));
        }
}
