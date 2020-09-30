### 依赖注入
#### 构造器注入

#### Set注入【重点】
- 依赖注入 Set注入
    - 依赖 bean对象的创建依赖于容器
    - 注入 bean对象中的所有属性由容器注入
   
【环境搭建】

1 复杂类型
```java
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
```

2 真实测试对象
```java
public class Student {

    private String name;
    private Address address;
    private String[] books;
    private List<String> hobby;
    private Map<String, String> card;
    private Set<String> games;
    private String wife;
    private Properties info;
// get set 方法省略
}
```

3 beans.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="student" class="com.cao.pojo.Student">
        <!--1 普通值注入-->
        <property name="name" value="我"/>
    </bean>
</beans>
```

4 测试类
```java
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }
}

```

5 注入信息
```xml
<bean id="address" class="com.cao.pojo.Address"/>

    <bean id="student" class="com.cao.pojo.Student">
        <!--1 普通值注入 value-->
        <property name="name" value="我"/>
        <!--2 普通值注入 ref-->
        <property name="address" ref="address"/>
        <!--3 数组-->
        <property name="books">
            <array>
                <value>红楼梦</value>
                <value>西游记</value>
                <value>水浒传</value>
                <value>三国演义</value>
            </array>
        </property>
        <!--4 List-->
        <property name="hobby">
            <list>
                <value>听歌</value>
                <value>敲代码</value>
                <value>看电影</value>
            </list>
        </property>
        <!--5 Map-->
        <property name="card">
            <map>
                <entry key="身份证" value="111111222222222222"/>
                <entry key="银行卡" value="221231213112131212"/>
            </map>
        </property>
        <!--6 Set-->
        <property name="games">
            <set>
                <value>LOL</value>
                <value>COC</value>
                <value>bob</value>
            </set>
        </property>
        <!--7 null-->
        <property name="wife">
            <null/>
        </property>
        <!--8 Properties-->
        <property name="info">
            <props>
                <prop key="学号">12345678</prop>
                <prop key="性别">男</prop>
            </props>
        </property>
    </bean>
```

5 测试结果
```java
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /**
         *Student{
         * name='我',
         * address=Address{address='null'},
         * books=[红楼梦, 西游记, 水浒传, 三国演义],
         * hobby=[听歌, 敲代码, 看电影],
         * card={
         *      身份证=111111222222222222,
         *      银行卡=221231213112131212
         *      },
         * games=[LOL, COC, bob],
         * wife='null',
         * info={
         *      学号=12345678,
         *      性别=男
         *      }
         * }
         */
    }
}
```

#### 拓展注入方式

p命名空间和c命名空间注入

导入约束
```xml
xmlns:p="http://www.springframework.org/schema/p"
xmlns:c="http://www.springframework.org/schema/c"
```
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--p命名空间注入 property-->
    <bean id="user" class="com.cao.pojo.User" p:name="小花" p:age="18"/>

    <!--c命名空间注入 property-->
    <bean id="user2" class="com.cao.pojo.User" c:name="小狗" c:age="19"/>


</beans>
```

测试
```java
public class Test(){
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user.toString());
        System.out.println(user2.toString());
    }
}
```


