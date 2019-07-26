package com.chenmin.dao;

import com.chenmin.entity.Test1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 67050
 */

public interface Test1DAO{


    /** 根据testId查询test */
    List<Test1> queryById(@Param("id") long id);

    /** 根据testId删除test */
    Integer deleteById(@Param("id") long id);

    /** 修改test */
    Integer updateTest(Test1 test);

    /** 新增test */
    Integer add(Test1 test);
}
