package Homework;

/**
 * @descriptions: Homework06
 * @author: 一只强
 * @date: 2022/10/20 11:18
 * @version: 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("圆柱体的底面积=" + String.format("%.3f",
                cylinder.calculateArea(3.55)) + '\n' + "圆柱体的体积=" +
                String.format("%.3f", cylinder.calculateVolume(8, 3.55)));
    }
}
class Cylinder {
    double radius;
    int height;

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateVolume(int height, double radius) {
        return Math.PI * radius * radius * height;
    }
}
