package one_stage.day08;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int a=0,b=0,c=0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='0'&&ch<='9'){
                a = a+1;
            }else if(ch>='a'&&ch<='z'){
                b = b+1;
            }else if(ch>='A'&&ch<='Z'){
                c = c+1;
            }


        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
