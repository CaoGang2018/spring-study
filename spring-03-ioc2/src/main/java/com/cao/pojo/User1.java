package com.cao.pojo;

/**
 * @author admin_cg
 * @data 2020/9/21 16:10
 */
public class User1 {
    private String name;

    public User1() {
        System.out.println("User1被创建了");
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
