package com.css.service;

import com.alibaba.fastjson.JSON;
import com.css.entity.BaseLog;
import com.css.util.JsonUtil;
import com.css.util.Operator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class TaskInfoService extends BasicService {
    public String queryFullTaskInfo(String param){
        HashMap<String,String> map = JSON.parseObject(param,HashMap.class);
        return JSON.toJSONString(taskInfoImpl.findFullTaskInfo(map));
    }
    public String queryRunningTaskInfo(String param){
        HashMap<String,String> map = JSON.parseObject(param,HashMap.class);
        return JSON.toJSONString(taskInfoImpl.findRunningTaskInfo(map));
    }
    public String queryFailedTaskInfo(String param){
        HashMap<String,String> map = JSON.parseObject(param,HashMap.class);
        return JSON.toJSONString(taskInfoImpl.findFailedTaskInfo(map));
    }
    public String queryNotRunningTaskInfo(String param){
        HashMap<String,String> map = JSON.parseObject(param,HashMap.class);
        return JSON.toJSONString(taskInfoImpl.findNotRunningTaskInfo(map));
    }
    public String queryWaitingResourceTaskInfo(String param){
        HashMap<String,String> map = JSON.parseObject(param,HashMap.class);
        return JSON.toJSONString(taskInfoImpl.findWaitingResourceTaskInfo(map));
    }
    public String queryWaitingTimeTaskInfo(String param){
        HashMap<String,String> map = JSON.parseObject(param,HashMap.class);
        return JSON.toJSONString(taskInfoImpl.findWaitingTimeTaskInfo(map));
    }
    public String getInstanceLog(String instanceId) throws Exception{
        BaseLog instanceLog= JsonUtil.getValueFromJson(Operator.OperatorSingle.INSTANCE.getLog(instanceId), BaseLog.class);
        return instanceLog.getReturnValue();
    }
    public String changeStatus(HashMap<String,Object> map) throws Exception {
        List list = (ArrayList)map.get("taskId");
        String changeType=(String)map.get("changeType");
        StringBuffer stringBuffer = new StringBuffer("{\"OperatorList\":[");
        for (int i = 0; i<list.size();i++){
            stringBuffer.append(Operator.OperatorSingle.INSTANCE.operator((String)list.get(i),changeType));
        }
        stringBuffer.append("]}");
        System.out.println(changeType);
        return stringBuffer.toString();
    }
}
