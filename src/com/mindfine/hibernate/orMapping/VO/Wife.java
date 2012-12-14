package com.mindfine.hibernate.orMapping.VO;

import org.hibernate.cfg.OneToOneSecondPass;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-14
 * Time: 上午11:25
 */
@Entity
public class Wife {
    private int id;
    private Husband husband;

    @OneToOne(mappedBy = "wife")
    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
}
