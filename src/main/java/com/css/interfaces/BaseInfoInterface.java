package com.css.interfaces;

import com.css.entity.BaseInfo;

import java.sql.Timestamp;
import java.util.List;

public interface BaseInfoInterface {
    List<BaseInfo> queryAllBaseInfo(Timestamp gmtdate);
    List<BaseInfo> queryCommonBaseInfo(Timestamp gmtdate);
    List<BaseInfo> queryNewBaseInfo(Timestamp gmtdate);
    List<BaseInfo> queryZipBaseInfo(Timestamp gmtdate);
}
