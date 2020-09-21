package com.cao.pojo;

/**
 * @author admin_cg
 * @data 2020/9/21 15:46
 */
public class User {
    private String name;

    public User() {
        System.out.println("User的无参构造");
    }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name=" + name);
    }
}
