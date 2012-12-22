package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-21
 * Time: 上午10:24
 */
@Entity
@Table(name = "Tree")
public class Exercise_2_Tree {
    private int id;
    private Exercise_2_Tree pTree;
    private Set<Exercise_2_Tree> cTreeSet;
    private String body;

    public Exercise_2_Tree(String body){
        this.body = body;
    }
    public Exercise_2_Tree(){}

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "pId")
    public Exercise_2_Tree getpTree() {
        return pTree;
    }

    public void setpTree(Exercise_2_Tree pTree) {
        this.pTree = pTree;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pTree")
    public Set<Exercise_2_Tree> getcTreeSet() {
        return cTreeSet;
    }

    public void setcTreeSet(Set<Exercise_2_Tree> cTreeSet) {
        this.cTreeSet = cTreeSet;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
