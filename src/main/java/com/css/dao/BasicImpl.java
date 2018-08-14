package com.css.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pengyan on 2017/5/3.
 */

public class BasicImpl {
    @Autowired
    public SqlSessionFactory sqlSessionFactory;
}
