### 注解开发

@Autowired
@Qualifier(value="")
@Component
@Value("good men")


1 bean

2 属性如何注入
```java
// 等价于 <bean id="user" class="com.cao.pojo.User"/>
@Component
public class User {
    // 相当于 <property name="name" value="good men"/>
    @Value("good men")
    public String name;
    // 或者
    @Value("good men")
    public void setName(String name) {
        this.name = name;
    }

}
```

3 衍生注解
- @Component衍生注解 按照mvc三层架构
    
    - dao 【@Repository】
    - services 【@Repository】
    - control 【@Service】