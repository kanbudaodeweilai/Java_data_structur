package one_stage.day08;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        String username = "zhangtianxiang";
        String password = "ztx980402";
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账号：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();
            if (username.equals(name) & password.equals(pwd)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("用户或密码错误");
            }
        }

    }
}
