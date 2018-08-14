package com.css.service;

import com.alibaba.fastjson.JSON;
import com.css.entity.BaseInfo;
import com.css.util.ConverStringToTimestamp;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

@Service
public class BaseInfoService extends BasicService{
    public String queryBaseInfo(String param){

        HashMap<String,String> hashMap = JSON.parseObject(param,HashMap.class);
        String queryType=hashMap.get("selected");
        String dateTime=hashMap.get("datetime");
        Timestamp timestamp = ConverStringToTimestamp.convertToTimestamp(dateTime);
        List<BaseInfo> baseInfos = new ArrayList<BaseInfo>();
        switch (queryType){
            case "0": baseInfos = convertMessage(baseInfoImpl.queryAllBaseInfo(timestamp));break;
            case "1": baseInfos = convertMessage(baseInfoImpl.queryCommonBaseInfo(timestamp));break;
            case "2": baseInfos = convertMessage(baseInfoImpl.queryNewBaseInfo(timestamp));break;
            case "3": baseInfos = convertMessage(baseInfoImpl.queryZipBaseInfo(timestamp));break;
        }
        return JSON.toJSONString(baseInfos) ;
    }


    //转换信息
    public List<BaseInfo> convertMessage(List<BaseInfo> baseInfoList){

        List<BaseInfo> baseInfoArrayList = new ArrayList<BaseInfo>();
        try {
            String path = BaseInfoService.class.getClassLoader().getResource("project.properties").getPath();
            Properties properties = new Properties();
            //System.out.println(path);
            InputStream in = new FileInputStream(path);
            properties.load(new InputStreamReader(in, "UTF-8"));
            for(BaseInfo baseInfo : baseInfoList){
                String projectEN = baseInfo.getName().toUpperCase();
                String projectCN = properties.getProperty(projectEN);
                baseInfo.setProject(projectCN);
                if (projectCN == null||projectCN.isEmpty()||projectCN.length()<=0){
                    continue;
                } else {
                    baseInfoArrayList.add(baseInfo);
                }


            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return baseInfoList;
    }

    public static void main(String[] args) {
        BaseInfoService baseInfoService = new BaseInfoService();
        System.out.println(baseInfoService.queryBaseInfo("ss"));
    }

}
