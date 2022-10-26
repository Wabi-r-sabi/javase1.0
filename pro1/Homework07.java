package Homework;

/**
 * @descriptions: Homework07
 * @author: 一只强
 * @date: 2022/10/26 8:45
 * @version: 1.0
 */
/*
class Phone1 {
    private String brand;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 1000;
            System.out.println("请输入合法价格,默认价格为1000");
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(String name) {
        System.out.println("打电话给" + name);
    }

    public void sendMessage(String name) {
        System.out.println("发短信给" + name);
    }

    public void showInfo() {
        System.out.println("手机信息如下");
        System.out.println(brand + " " + price + " " + color);
    }
}
*/

class Account {
    private int id;
    private String name;
    private double balance;
    private String password;
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) {//姓名长度为2，3，4
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名要求(长度为2,3,4位),默认值阿布");
            this.name = "阿布";
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance % 100 == 0) {
            deposit();
            this.balance = balance;
        } else {
            System.out.println("存款失败");
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if ("123456".equals(password)) {
            this.password = password;
            withdraw();
        } else {
            System.out.println("密码错误,取款失败,默认值000000");
            this.password = "000000";
        }
    }
    public void deposit() {
        System.out.println("存款成功");
    }
    public void withdraw() {
        System.out.println("取款成功");
    }
    public void showInfo() {
        System.out.println("账户信息如下");
        System.out.println("name=" + name + "id=" + id + '\n'
                + "balance=" + balance + "password=" + password);
    }
}