package turkceTekrarUdemy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class A41Date {
    public static void main(String[] args) {
        Date bugun = new Date();
        System.out.println(bugun);//Thu Oct 05 00:15:56 CEST 2023

        DateFormat f=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(f.format(bugun));//Bugunun tarihini su formatta goster //05/10/2023 00:19:24

        //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        //Format ezberlemeye gerek yok siteden bakilabilir

        Date tarih=null;

        try {
            tarih=f.parse("10/10/2020 10:20:10" );
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(tarih);

        System.out.println(f.format(tarih));//10/10/2020 10:20:10

        Calendar c= new GregorianCalendar();

        c.set(2012,0,10);
        Date takvimgunu=c.getTime();
        System.out.println(takvimgunu);//Tue Jan 10 00:32:00 CET 2012
        System.out.println(f.format(takvimgunu));//10/01/2012 00:32:00//ay index aliyor

        //Bizim genelde kullandigimiz 3 class var

        LocalDateTime d=LocalDateTime.of(2015,5,10,9,22,33);

        //Localdatetime da hem date hem time kullanilir

        Period p =Period.of(3,0,2);//ekleme cikarma icin belirtilir
        System.out.println(p);

        d=d.minus(p);
        System.out.println("d "+d);//2012-05-08T09:22:33

        DateTimeFormatter f1=DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm a");
        System.out.println(f1.format(d));//2012/05/08 09:22 AM

        for(String zone:ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        LocalDate a1=LocalDate.now();

        DateTimeFormatter aa=DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
        System.out.println(aa.format(a1));












    }
}
