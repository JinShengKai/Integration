package com.css.dao;

import com.css.entity.TaskInfo;
import com.css.interfaces.TaskInfoInterface;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
@Repository
public class TaskInfoImpl extends BasicImpl implements TaskInfoInterface{
    @Override
    public List<TaskInfo> findFullTaskInfo(HashMap<String,String> hashMap){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<TaskInfo> findFullTaskInfoList =sqlSession.selectList("findFullTaskInfo",hashMap);
        sqlSession.close();
        return findFullTaskInfoList;
    }
    @Override
    public   List<TaskInfo> findFailedTaskInfo(HashMap<String, String> hashMap){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<TaskInfo> findFailedTaskInfoList =sqlSession.selectList("findFailedTaskInfo",hashMap);
        sqlSession.close();
        return findFailedTaskInfoList;
    }
    @Override
    public   List<TaskInfo> findRunningTaskInfo(HashMap<String, String> hashMap){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<TaskInfo> findRunningTaskInfoList =sqlSession.selectList("findRunningTaskInfo",hashMap);
        sqlSession.close();
        return findRunningTaskInfoList;
    }
    @Override
    public   List<TaskInfo> findNotRunningTaskInfo(HashMap<String, String> hashMap){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<TaskInfo> findNotRunningTaskInfo =sqlSession.selectList("findNotRunningTaskInfo",hashMap);
        sqlSession.close();
        return findNotRunningTaskInfo;
    }
    @Override
    public   List<TaskInfo> findWaitingTimeTaskInfo(HashMap<String, String> hashMap){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<TaskInfo> findWaitingTimeTaskInfoList =sqlSession.selectList("findWaitingTimeTaskInfo",hashMap);
        sqlSession.close();
        return findWaitingTimeTaskInfoList;
    }
    @Override
    public   List<TaskInfo> findWaitingResourceTaskInfo(HashMap<String, String> hashMap){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<TaskInfo> findWaitingResourceTaskInfo =sqlSession.selectList("findWaitingResourceTaskInfo",hashMap);
        sqlSession.close();
        return findWaitingResourceTaskInfo;
    }
}
