package com.mindfine.spring.model;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 13-1-1
 * Time: 下午11:16
 */
public class Student {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
