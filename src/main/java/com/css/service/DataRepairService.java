package com.css.service;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DataRepairService extends BasicService {
    public String queryDataRepairList(String param){

        HashMap<String,String> hashMap = JSON.parseObject(param,HashMap.class);
        String dateTime=hashMap.get("bizdate").replaceAll("[^0-9]","");
        int bizdate = Integer.valueOf(dateTime)-1;
        return JSON.toJSONString(dataRepairImpl.queryDataRepairList(bizdate));
    }
}
