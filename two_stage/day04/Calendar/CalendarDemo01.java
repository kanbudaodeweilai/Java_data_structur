package two_stage.day04.Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo01 {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        System.out.println(c.getTime());
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(year+" "+month+" "+day);

    }
}
