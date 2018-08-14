package com.css.service;


import com.css.dao.BaseInfoImpl;
import com.css.dao.DataRepairImpl;
import com.css.dao.TaskInfoImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pengyan on 2017/5/3.
 */
public class BasicService {
    @Autowired
    public BaseInfoImpl baseInfoImpl;
    @Autowired
    public TaskInfoImpl taskInfoImpl;
    @Autowired
    public DataRepairImpl dataRepairImpl;
}
