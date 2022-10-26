package Homework;

/**
 * @descriptions: Test
 * @author: 一只强
 * @date: 2022/10/26 8:48
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(654321);
        account.setName("张三");
        account.setBalance(6000);
        account.setPassword("123456");
        account.showInfo();
    }
}
