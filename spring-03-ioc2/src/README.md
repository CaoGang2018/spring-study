## 介绍
spring ioc原理
详见``beans.xml``注释



```xml
<!--
    默认使用无参构造

    -->
    <!-- 无参构造
    <bean id="user" class="com.cao.pojo.User">
        <property name="name" value="big old"/>
    </bean>
    -->
    <!--有参构造 1 下标赋值
    name=我是大个
    <bean id="user" class="com.cao.pojo.User">
        <constructor-arg index="0" value="我是大个"/>
    </bean>
    -->
    <!--有参构造 2 通过类型赋值 不建议使用
    name=类型
    <bean id="user" class="com.cao.pojo.User">
        <constructor-arg type="java.lang.String" value="类型"/>
    </bean>
    -->

    <!--有参构造 3  通过方法名赋值
    name=类型3
    -->
    <bean id="user" class="com.cao.pojo.User">
        <constructor-arg name="name" value="类型3"/>
    </bean>

    <!--
    id: bean的唯一标识符，也就是对象名
    class：bean对象所有应的全限定名：包名+类名
    name:也是别名，name更高级 可以同时取多个别名"user12 ssas da"全是别名
    -->
    <bean id="user1" class="com.cao.pojo.User1" name="user12 ssas da">
    </bean>

    <!--别名-->
    <alias name="user" alias="userT"/>

    <!--
    import
    用于团队开发，将多个xml配置文件合并
    -->
```

