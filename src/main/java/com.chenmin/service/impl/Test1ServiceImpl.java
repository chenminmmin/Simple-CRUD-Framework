package com.chenmin.service.impl;

import com.chenmin.dao.Test1DAO;
import com.chenmin.entity.Test1;
import com.chenmin.service.ITest1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 包权限管理
 * @author Chenmin
 * @Da2019年7月25日 2019年7月25日 - 下午0:05
 * @Description 测试的 service实现类
 */
@Service
public class Test1ServiceImpl  implements ITest1Service {

    @Autowired
    private Test1DAO test1DAO;

    /** 根据testId查询test */
    @Override
//    public List<Test1> queryById(long id){
    public Test1 queryById(long id){
//        return test1DAO.selectList(new QueryWrapper<Test1>().eq("id",id));
        return test1DAO.selectById(id);
    }

    /** 根据testId删除test */
    @Override
    public Integer deleteById(long id){
        return test1DAO.deleteById(id);
    }

    /** 修改test */
    @Override
    public Integer updateTest(Test1 test){
        return test1DAO.updateById(test);
    }

    /** 新增test */
    @Override
    public Integer add(Test1 test){
        return test1DAO.insert(test);
    }


}
