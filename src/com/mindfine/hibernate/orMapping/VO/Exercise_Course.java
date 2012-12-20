package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-19
 * Time: 下午7:06
 */
@Entity
public class Exercise_Course {
    private int id;
    private String name;
    private Set<Exercise_Student> studentSet = new HashSet<Exercise_Student>();
    private Set<Exercise_Grade> gradeSet = new HashSet<Exercise_Grade>();

    @Id
    @GeneratedValue
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

    @ManyToMany()
    @JoinTable(
            name = "teach",
            joinColumns = {@JoinColumn(name = "courseId")},
            inverseJoinColumns = {@JoinColumn(name = "studentId")}
    )
    public Set<Exercise_Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Exercise_Student> studentSet) {
        this.studentSet = studentSet;
    }

    @OneToMany(mappedBy = "id.cId")
    public Set<Exercise_Grade> getGradeSet() {
        return gradeSet;
    }

    public void setGradeSet(Set<Exercise_Grade> gradeSet) {
        this.gradeSet = gradeSet;
    }
}
