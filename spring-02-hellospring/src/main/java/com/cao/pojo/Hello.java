package com.cao.pojo;

/**
 * @author admin_cg
 * @date 2020/9/9 19:39
 */
public class Hello {
    private String str;
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                ", x=" + x +
                '}';
    }
}
