package com.css.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class JsonUtil {


    public static <T> T getValueFromJson(String jsonStr, Class<T> type) {
        Gson gs = new Gson();
        T result=null ;
        try {
            result= gs.fromJson(jsonStr.trim(), type);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return result;
    }

    public static <T> List<T> getvalueListFromJson(String jsonStr, Class<T> type) {
        Gson gs = new Gson();
        List<T> result = gs.fromJson(jsonStr, new TypeToken<List<T>>() {

        }.getType());
        return result;
    }

//	public static void main(String[] args) throws Exception {
//		String jsonData = CountWithParamter.getInstance().getJsonStrFromBase("SC_JX_GSZJ", "2016-12-20 00:00:00", "1");
//		System.out.println(jsonData);
//		BaseInfo baseInfo=JsonUtil.getInstance().getValueFromJson(jsonData, BaseInfo.class);
//		System.out.println(baseInfo);
//	}
}
