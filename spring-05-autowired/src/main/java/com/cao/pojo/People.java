package com.cao.pojo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author admin_cg
 * @data 2020/9/23 21:23
 */
public class People {

    @Autowired
    @Qualifier(value = "dog")
    private Dog dog;
    @Autowired
    private Cat cat;
    private String name;


    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
