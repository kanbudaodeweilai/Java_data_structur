package one_stage.day05;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxab = getMax(a,b);
        System.out.println(maxab);



    }
    public static int getMax(int a ,int b){
        int max = a>b?a:b;
        return max;
    }
}
