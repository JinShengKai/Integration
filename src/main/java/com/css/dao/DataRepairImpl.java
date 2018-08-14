package com.css.dao;


import com.css.entity.RepairInfo;
import com.css.interfaces.DataRepairInterface;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataRepairImpl extends BasicImpl  implements DataRepairInterface{
    @Override
    public List<RepairInfo> queryDataRepairList(@Param("bizdate") int datetime){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<RepairInfo> queryDataRepairList =sqlSession.selectList("findRepairData",datetime);
        sqlSession.close();
        return queryDataRepairList;
    }
}

