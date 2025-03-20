package java_13_classes_essenciais;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClasseDate {
    public static void main(String[] args) {

        // Calendar
        Calendar agora = Calendar.getInstance();
        Date data = agora.getTime();
        System.out.println(data);

        // GregorianCalendar
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.getTime());
        GregorianCalendar gregorianCalendarEu = new GregorianCalendar(1976, 0, 6, 19, 01);
        System.out.println(gregorianCalendarEu.getTime());

        // Date (depreciada)
        Date date = new Date();
        // Date dateEu = new Date(1976, 0, 6);
        System.out.println(date);
        // System.out.println(dateEu);
    }

}
