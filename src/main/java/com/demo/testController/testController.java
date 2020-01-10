package com.demo.testController;

import com.demo.testDo.userInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.testService.*;
/**
 * @Author: 张全成
 * @Date: 2019/5/28 9:45
 * @Version 1.0
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("v1")
public class testController {

    @Autowired
    testService testService;
    @GetMapping("/hi")
    public userInfoDO saymess(){
        return testService.sayMess();
    }
}
