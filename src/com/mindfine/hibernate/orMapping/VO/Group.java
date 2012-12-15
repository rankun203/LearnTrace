package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
    private Set<User> users = new HashSet<User>();

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

    //双向关联的时候，需要设定OneToMany这端的mappedBy属性，该属性即Many一方是以什么标识符来保存自己的。
    @OneToMany(mappedBy = "group")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
