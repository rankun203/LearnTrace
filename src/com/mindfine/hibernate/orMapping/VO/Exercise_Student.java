package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-19
 * Time: 下午7:05
 */
@Entity
public class Exercise_Student {
    private int id;
    private String name;
    private Set<Exercise_Course> courseSet = new HashSet<Exercise_Course>();
    private Set<Exercise_Grade> gradeSet = new HashSet<Exercise_Grade>();

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "id.sId")
    public Set<Exercise_Grade> getGradeSet() {
        return gradeSet;
    }

    public void setGradeSet(Set<Exercise_Grade> gradeSet) {
        this.gradeSet = gradeSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(
            name = "teach",
            joinColumns = {@JoinColumn(name = "studentId")},
            inverseJoinColumns = {@JoinColumn(name = "courseId")}
    )
    public Set<Exercise_Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Exercise_Course> courseSet) {
        this.courseSet = courseSet;
    }
}
