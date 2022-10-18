package Homework;

/**
 * @descriptions: Homework04
 * @author: 一只强
 * @date: 2022/10/18 20:10
 * @version: 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "华为";
        phone.color = "red";
        phone.memory = 512;
        phone.price = 8888.0;
        System.out.println("手机的信息如下:" + '\n' + "brand=" + phone.brand + '\t' + "color=" +
                phone.color + '\n' + "memory=" + phone.memory + '\t' + "price=" + phone.price);
        System.out.println("手机的功能如下:");
        phone.sendMessage();
        phone.call();
        phone.useFunction();
    }
}

class Phone {
    String brand;
    double price;
    String color;
    int memory;

    public void call() {
        System.out.println("打电话给xxx");
    }

    public void sendMessage() {
        System.out.println("发信息给xxx");
    }

    public void useFunction() {
        System.out.println("编译java语言");
    }
}
