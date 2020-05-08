package com.example.test;

/**
 * @author ceshi
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/12/1811:55
 */
public class User {


    private Integer  name;


    @Override
    public String toString() {
        return "User{" + "name=" + name + '}';
    }


    public User() {
    }

    public User(Integer name) {
        this.name = name;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }
}


