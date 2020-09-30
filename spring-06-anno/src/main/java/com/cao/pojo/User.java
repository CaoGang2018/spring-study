package com.cao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author admin_cg
 * @data 2020/9/24 19:10
 */

// 等价于 <bean id="user" class="com.cao.pojo.User"/>
@Component
public class User {
    // 相当于 <property name="name" value="good men"/>

    public String name;
    @Value("good men")
    public void setName(String name) {
        this.name = name;
    }
}
