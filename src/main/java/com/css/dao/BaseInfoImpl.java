package com.css.dao;

import com.css.entity.BaseInfo;
import com.css.interfaces.BaseInfoInterface;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class BaseInfoImpl extends BasicImpl implements BaseInfoInterface{
    @Override
    public List<BaseInfo> queryAllBaseInfo(Timestamp gmtdate){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<BaseInfo>  queryAllBaseInfoList = sqlSession.selectList("findAllBaseMessage",gmtdate);
        sqlSession.close();
        return queryAllBaseInfoList;
    }
    @Override
    public List<BaseInfo> queryCommonBaseInfo(Timestamp gmtdate){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<BaseInfo>  queryCommonBaseInfoList = sqlSession.selectList("findCommonBaseInfo",gmtdate);
        sqlSession.close();
        return queryCommonBaseInfoList;
    }
    @Override
    public List<BaseInfo> queryNewBaseInfo(Timestamp gmtdate){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<BaseInfo>  queryNewBaseInfoList = sqlSession.selectList("findNewBaseInfo",gmtdate);
        sqlSession.close();
        return queryNewBaseInfoList;
    }
    @Override
    public List<BaseInfo> queryZipBaseInfo(Timestamp gmtdate){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<BaseInfo>  queryZipBaseInfoList =  sqlSession.selectList("findZipBaseInfo",gmtdate);
        sqlSession.close();
        return queryZipBaseInfoList;
    }

}
