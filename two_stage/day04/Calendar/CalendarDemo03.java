package two_stage.day04.Calendar;

import java.util.Calendar;

public class CalendarDemo03 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2098,5,20);
        c.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }
}
