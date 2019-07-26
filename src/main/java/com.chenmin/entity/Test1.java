package com.chenmin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "test1")
public class Test1 {
    Long id;
    String name;
    long appId;
}
