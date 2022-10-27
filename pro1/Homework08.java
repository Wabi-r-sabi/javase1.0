package Homework;

/**
 * @descriptions: Rectangle
 * @author: 一只强
 * @date: 2022/10/27 14:20
 * @version: 1.0
 */

/*
public class Rectangle {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        System.out.println("无参构造方法被调用");
    }

    public Rectangle(double height) {
        System.out.println("带一个参数的造方法被调用");
        this.height = height;
    }

    public Rectangle(double height, double width) {
        System.out.println("带两个参数的造方法被调用");
        this.height = height;
        this.width = width;
    }

    public double getParameter() {
        return (height + width) * 2;
    }

    public double getArea() {
        return height * width;
    }

    public void showInfo() {
        System.out.println("长方形的周长为:" + getParameter());
        System.out.println("长方形的面积为:" + getArea());
    }
}
*/

class Resume {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Resume() {
        System.out.println("无参构造方法被调用");
    }

    public Resume(String name, String sex, int age) {
        System.out.println("带三个参数的构造方法被调用");
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void introduce() {
        System.out.println("我是:" + name + "," + "性别:" + sex + "," + "年龄:" + age);
    }
}