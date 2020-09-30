
#### Bean的自动装配
- 自动装配是Spring满足bean依赖的一种方式
- Spring会在上下文中自动寻找，并给bean装配属性

三种装配方式
- 1 在xml中显式的装配
- 2 在java中显式装配
- 3 隐式的自动装配bean

#### 测试
1 环境搭建

- 一个人有两个宠物

2 byName自动装配
```xml
<!--
byName:会自动在容器上下文中查找，和自己对象set方法后面对应的bean id
-->
<bean id="people" class="com.cao.pojo.People" autowire="byName">
    <property name="name" value="我呀"/>
</bean>
```

3 byType自动装配
```xml
<bean id="cat" class="com.cao.pojo.Cat"/>
 <bean id="dog" class="com.cao.pojo.Dog"/>


 <!--
 byName:会自动在容器上下文中查找，和自己对象set方法后面对应的bean id
 byType:会自动在容器上下文中查找，和自己对象属性类型的bean id
 -->
 <bean id="people" class="com.cao.pojo.People" autowire="byName">
     <property name="name" value="我呀"/>
 </bean>
```

- byName 所有bean id唯一
- byType 所有bean的class唯一

4 使用注解自动装配

- 导入约束 ``xmlns:context="http://www.springframework.org/schema/context"``
- 配置注解支持``<context:annotation-config/>``

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <context:annotation-config/>

</beans>
```

 **@Autowired** 
 
 直接在属性或者Set方法上使用
 
 可以省略Set方法，前提是自动装配的属性在IOC容器中存在，且符合名字byName
 
 > @Nullable 标记字段可以为空

```java
public class People {

    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;
    private String name;
}
```

**@Qualifier(value="")**

指定某一个对象自动装配

```java
public class People {

    @Autowired
    @Qualifier(value = "dog")
    private Dog dog;
    @Autowired
    private Cat cat;
    private String name;
}
```

