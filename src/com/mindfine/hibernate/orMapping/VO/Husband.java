package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-14
 * Time: 上午11:24
 */
@Entity
public class Husband {
    private int id;
    private String name;
    private Wife wife;

    @Id
    @GeneratedValue()
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne
    @JoinColumn(name = "wifeId")
    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
