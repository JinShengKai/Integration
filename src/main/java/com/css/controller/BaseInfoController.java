package com.css.controller;
import com.css.util.ConverStringToTimestamp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.ParseException;

@Controller
@RequestMapping(value = "baseInfo")
public class BaseInfoController extends BasicController {
    //跳转页面
    @RequestMapping(value = "index")
    public String taskInfo(){
        return "baseinfo";
    }
    @RequestMapping(value = "queryTask",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryAllTask(@RequestBody String param) throws ParseException{
        String json=baseInfoService.queryBaseInfo(param);
        return json;
    }
}
