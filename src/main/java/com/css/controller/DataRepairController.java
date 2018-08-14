package com.css.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;

@Controller
@RequestMapping(value="RDS")
public class DataRepairController extends BasicController {
    //跳转页面
    @RequestMapping(value = "dataRepair")
    public String taskInfo(){
        return "datarepair";
    }
    @RequestMapping(value = "queryDataRepairList",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryDataRepairList(@RequestBody String param)  {
        System.out.println(param);
        String json=dataRepairService.queryDataRepairList(param);
        System.out.println(json);
        return json;
    }
}
