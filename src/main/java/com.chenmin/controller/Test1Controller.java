package com.chenmin.controller;

import com.chenmin.entity.Test1;
import com.chenmin.service.ITest1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Chenmin
 * @Da2019年7月25日 2019年7月25日 - 下午0:02
 * @Description 测试  controller ： 增删改查
 */
@Controller
@RequestMapping("/test1")
public class Test1Controller {

    @Autowired
    private ITest1Service test1Service;

    // 根据id查询test1
    @PostMapping("/queryById")
    @ResponseBody
    public List<Test1> queryById(@RequestParam("id") long id) {
        return test1Service.queryById(id);
    }

    // 根据id删除test1
    @PostMapping("/deleteById")
    @ResponseBody
    public String deleteById(@RequestParam("id") long id) {
        Integer deleteNum = test1Service.deleteById(id);
        if(deleteNum == 0) {
            return "删除失败";
        }
        return "删除成功";
    }

    // 修改test1
    @PostMapping("/updateTest")
    @ResponseBody
    public String updateTest(@RequestBody Test1 test) {
        Integer updateNum = test1Service.updateTest(test);
        if(updateNum == 0) {
            return "更新失败";
        }
        return "更新成功";
    }

    // 新建一个test1字段
    @PostMapping("/add")
    @ResponseBody
    public String add(@RequestBody Test1 test) {
        Integer addNum = test1Service.add(test);
        if(addNum == 0) {
            return "新增失败";
        }
        return "新增成功";
    }

}
