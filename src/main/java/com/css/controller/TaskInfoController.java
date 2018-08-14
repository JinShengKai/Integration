package com.css.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;


@Controller
@RequestMapping("operator")
public class TaskInfoController extends BasicController {
    @RequestMapping(value = "{project}")
    public String queryTaskInfo(@PathVariable String project,ModelMap modelMap){
        modelMap.addAttribute("project",project);
        return "operator";
    }
    @RequestMapping(value = "queryFullTaskInfo",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryFullTaskInfo(@RequestBody String param){
        String json = taskInfoService.queryFullTaskInfo(param);
        return json;
    }
    @RequestMapping(value = "queryNotRunningTaskInfo",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryNotRunningTaskInfo(@RequestBody String param){
        String json = taskInfoService.queryNotRunningTaskInfo(param);
        return json;
    }
    @RequestMapping(value = "queryRunningTaskInfo",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryRunningTaskInfo(@RequestBody String param){
        String json = taskInfoService.queryRunningTaskInfo(param);
        return json;
    }
    @RequestMapping(value = "queryFailedTaskInfo",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryFailedTaskInfo(@RequestBody String param){
        String json = taskInfoService.queryFailedTaskInfo(param);
        return json;
    }
    @RequestMapping(value = "queryWaitingResourceTaskInfo",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryWaitingResourceTaskInfo(@RequestBody String param){
        String json = taskInfoService.queryWaitingResourceTaskInfo(param);
        return json;
    }
    @RequestMapping(value = "queryWaitingTimeTaskInfo",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryWaitingTimeTaskInfo(@RequestBody String param){
        String json = taskInfoService.queryWaitingTimeTaskInfo(param);
        return json;
    }

    @ResponseBody
    @RequestMapping(value = "changeStatus", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    public String deleteArticle(@RequestBody HashMap<String,Object> map) throws Exception{

        return taskInfoService.changeStatus(map);
    }

    @RequestMapping(value = "taskLog")
    public String getTaskLog(String taskId,ModelMap modelMap) throws Exception{
        String instanceLog=taskInfoService.getInstanceLog(taskId).replaceAll("\r\n","<br/>");;
        modelMap.addAttribute("log",instanceLog);
        return "logView";
    }

}
