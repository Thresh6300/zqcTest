package com.demo.testDo;

/**
 * @Author: 张全成
 * @Date: 2019/5/28 11:25
 * @Version 1.0
 */
public class userInfoDO {
    public String code;
    public String name;

    @Override
    public String toString() {
        return "userInfoDO{" + "code='" + code + '\'' + ", name='" + name + '\'' + '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
