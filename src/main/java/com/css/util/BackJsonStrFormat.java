package com.css.util;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/*
 * pengyan1989
 * 接口返回消息
 * code为代码
 * desc为代码语义
 * result为返回详细信息
 */

/**
 * @author pengyan
 * 
 * @param <T>
 */
public class BackJsonStrFormat<T> {
	public static String backJsonStr(String code, String desc, Object object) {
		return "{\"head\":{\"code\": \"" + code + "\", \"desc\":\"" + desc + "\"}, \"result\": " + JSON.toJSONString(object) + "}";
	}

	public static <E> String backJsonDate(String code, String desc, Object... object) {
		LinkedList<Object> list = new LinkedList<Object>();
		for (int i = 0; i < object.length; i++) {
			if (object[i] instanceof LinkedList<?>) {
				HashMap<String, LinkedList<?>> map = new HashMap<String, LinkedList<?>>();
				map.put("list", (LinkedList<?>) object[i]);
				list.add(map);
			} else if (object[i] instanceof ArrayList<?>) {
				HashMap<String, ArrayList<?>> map = new HashMap<String, ArrayList<?>>();
				map.put("list", (ArrayList<?>) object[i]);
				list.add(map);
			} else {
				list.add(object[i]);
			}
		}
		return "{\"head\":{\"code\": \"" + code + "\", \"desc\":\"" + desc + "\"}, \"data\": " + JSON.toJSONString(list) + "}";
	}

	public static <T> String backStr(T result) {
		return JSON.toJSONString(result);
	}
}
