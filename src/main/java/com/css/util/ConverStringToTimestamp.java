package com.css.util;

import com.alibaba.fastjson.JSON;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ConverStringToTimestamp {
    public static Timestamp convertToTimestamp(String gmtdate) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //如果gmtdate为空，时间将取当前时间
            if (gmtdate == null || gmtdate.equals("") || gmtdate.length() == 0) {
                gmtdate = simpleDateFormat.format(date);
                timestamp = new Timestamp(simpleDateFormat.parse(gmtdate).getTime());
            } else {
                timestamp = new Timestamp(simpleDateFormat.parse(gmtdate).getTime());
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timestamp;
    }
    public static String convertToString(Timestamp gmtdateTimestamp) throws ParseException {

        Date date = new Date();
        SimpleDateFormat simpleDateFormatOutputGmtdate = new SimpleDateFormat("yyyy-MM-dd");
        String gmtdate=simpleDateFormatOutputGmtdate.format(gmtdateTimestamp);

        return gmtdate;
    }
    public static  Timestamp getTodayTimestamp() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datetime=simpleDateFormat.format(date);

        Timestamp  timestamp = new Timestamp(simpleDateFormat.parse(datetime).getTime());
        return  timestamp;
    }
    public static String getTodayString(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datetime=simpleDateFormat.format(date);


        return  datetime;
    }
    public static void main(String[] args) throws ParseException {
       String para= "{\"bizdate\":\"2018-08-14\"}";
        HashMap<String,String> hashMap = JSON.parseObject(para,HashMap.class);
        String dateTime=hashMap.get("bizdate").replaceAll("[^0-9]","");
        int bizdate = Integer.valueOf(dateTime);
        System.out.println("datetime"+dateTime);
    }
}
