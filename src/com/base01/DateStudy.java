package com.base01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStudy {
    public static void main(String[] args) throws ParseException {
        /*long t1= (25L *365+5)*24*3600*1000+16*3600000;
        long t2=t1+365*24*3600000L-1000;
        long t3=t1+(long)((t2-t1)*Math.random());
        System.out.println(new Date(t1));
        System.out.println(new Date(t2));
        System.out.println(new Date(t3));
        Date date=new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());*/
       /* SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse("2000-12-31 23:59:59");
        Date[] dd=new Date[9];
        for (int i = 0; i < dd.length; i++) {
            dd[i]=new Date((long) (Math.random()*date.getTime()));
        }
        for (Date date1 : dd) {
            System.out.println(sdf.format(date1));
        }
        for (int i = 0; i < dd.length; i++) {
            for (int j = 0; j < i; j++) {
                long l1=sdf.parse("2000-01-01 "+sdf.format(dd[i]).split(" ")[1]).getTime();
                long l2=sdf.parse("2000-01-01 "+sdf.format(dd[j]).split(" ")[1]).getTime();
                if(l2>l1){
                    Date temp=dd[i];
                    dd[i]=dd[j];
                    dd[j]=temp;
                }
            }
        }
        for (Date date1 : dd) {
            System.out.println(sdf.format(date1));
        }*/
        Calendar calendar=Calendar.getInstance();
        Date date=calendar.getTime();
        System.out.println(calendar);
        calendar.add(Calendar.MONTH,1);
        System.out.println(calendar.getTime());
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,-1);
        System.out.println(calendar.getTime());
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,-1);
        calendar.set(Calendar.DATE,3);
        System.out.println(calendar.getTime());
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,2);
        calendar.set(Calendar.DATE,-2);
        System.out.println(calendar.getTime());
    }

}
