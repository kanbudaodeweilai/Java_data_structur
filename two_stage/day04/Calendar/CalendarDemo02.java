package two_stage.day04.Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        Calendar c= Calendar.getInstance();
        c.set(year,2,1);//这里的2 其实指的是3月  月份是从0开始的
        //abstract void add(int field, int amount) 根据日历的规则，将指定的时间量添加或减去给定的日历字段。
        c.add(Calendar.DATE,-1);
        int date  = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }
}
