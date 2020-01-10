package com.demo.testService.testServiceImpl;

import com.demo.dao.userDao;
import com.demo.testDo.userInfoDO;
import com.demo.testService.testService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 张全成
 * @Date: 2019/5/28 9:59
 * @Version 1.0
 */

@Service
public class testServiceImpl implements testService {
    private final Logger logger = LoggerFactory.getLogger(testServiceImpl.class);

    @Autowired
    private userDao userDao;
    @Override
    public userInfoDO sayMess() {
        logger.info("进入sayMess");
        userInfoDO userInfoDO =  userDao.getUserInfo();
        logger.info(userInfoDO.getName());
        return userInfoDO;
    }
}
