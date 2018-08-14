package com.css.controller;

import com.css.service.BaseInfoService;
import com.css.service.DataRepairService;
import com.css.service.TaskInfoService;
import org.springframework.beans.factory.annotation.Autowired;

public class BasicController {
    @Autowired
    public BaseInfoService baseInfoService;
    @Autowired
    public TaskInfoService taskInfoService;
    @Autowired
    public DataRepairService dataRepairService;
}
