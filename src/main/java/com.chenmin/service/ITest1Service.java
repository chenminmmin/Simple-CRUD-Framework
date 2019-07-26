package com.chenmin.service;

import com.chenmin.entity.Test1;

import java.util.List;

/**
 * @author Chenmin
 * @Da2019年7月25日 2019年7月25日 - 下午0:02
 * @Description 测试的service接口
 */

public interface ITest1Service {

    /** 根据testId查询test */
    List<Test1> queryById(long id);

    /** 根据testId删除test */
    Integer deleteById(long id);

    /** 修改test */
    Integer updateTest(Test1 test);

    /** 新增test */
    Integer add(Test1 test);
}
