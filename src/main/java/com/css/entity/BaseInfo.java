package com.css.entity;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;


public class BaseInfo implements Serializable {
    private String project;
    private String name;
    private String appId;
    @JSONField(format = "yyyy-MM-dd")  //FastJson包使用注解
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8") //Jackson包使用注解
    @DateTimeFormat(pattern = "yyyy-MM-dd")   //格式化前台日期参数注解
    private Timestamp bizDate;
    private String taskCount;
    private String statusNotRunning;
    private String statusWaiting;
    private String statusWaitingResource;
    private String statusRunning;
    private String statusFailed;
    private String statusSucceed;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")  //FastJson包使用注解
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") //Jackson包使用注解
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")   //格式化前台日期参数注解
    private Timestamp taskBegin;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")  //FastJson包使用注解
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") //Jackson包使用注解
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")   //格式化前台日期参数注解
    private Timestamp taskFinished;

    private String taskWorkingTime;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Timestamp getBizDate() {
        return bizDate;
    }

    public void setBizDate(Timestamp bizDate) {
        this.bizDate = bizDate;
    }

    public String getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(String taskCount) {
        this.taskCount = taskCount;
    }

    public String getStatusNotRunning() {
        return statusNotRunning;
    }

    public void setStatusNotRunning(String statusNotRunning) {
        this.statusNotRunning = statusNotRunning;
    }

    public String getStatusWaiting() {
        return statusWaiting;
    }

    public void setStatusWaiting(String statusWaiting) {
        this.statusWaiting = statusWaiting;
    }

    public String getStatusWaitingResource() {
        return statusWaitingResource;
    }

    public void setStatusWaitingResource(String statusWaitingResource) {
        this.statusWaitingResource = statusWaitingResource;
    }

    public String getStatusRunning() {
        return statusRunning;
    }

    public void setStatusRunning(String statusRunning) {
        this.statusRunning = statusRunning;
    }

    public String getStatusFailed() {
        return statusFailed;
    }

    public void setStatusFailed(String statusFailed) {
        this.statusFailed = statusFailed;
    }

    public String getStatusSucceed() {
        return statusSucceed;
    }

    public void setStatusSucceed(String statusSucceed) {
        this.statusSucceed = statusSucceed;
    }

    public Timestamp getTaskBegin() {
        return taskBegin;
    }

    public void setTaskBegin(Timestamp taskBegin) {
        this.taskBegin = taskBegin;
    }

    public Timestamp getTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(Timestamp taskFinished) {
        this.taskFinished = taskFinished;
    }


    public String getTaskWorkingTime() {
        return taskWorkingTime;
    }

    public void setTaskWorkingTime(String taskWorkingTime) {
        this.taskWorkingTime = taskWorkingTime;
    }
}
