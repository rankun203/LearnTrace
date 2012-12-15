package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-15
 * Time: 下午7:29
 */
@Entity
@Table(name="t_group")
public class Group {
    private int id;
    private String name;

    @Id
    @Column(name="g_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="g_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
