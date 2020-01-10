package com.demo.dao;

import com.demo.testDo.userInfoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 张全成
 * @Date: 2019/5/28 11:30
 * @Version 1.0
 */
@Mapper
public interface userDao {
    public userInfoDO getUserInfo();
}
