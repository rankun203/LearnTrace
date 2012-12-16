package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-15
 * Time: 下午11:31
 */
@Entity
public class Teacher {
    private int id;
    private String name;
    private Set<Student> students = new HashSet<Student>();

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

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "t_s",
            joinColumns = {@JoinColumn(name = "teacher_Id")},
            inverseJoinColumns = {@JoinColumn(name = "student_Id")}
    )
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
