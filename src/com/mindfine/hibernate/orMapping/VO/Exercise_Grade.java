package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-19
 * Time: 下午7:24
 */
@Entity
public class Exercise_Grade {
    private Exercise_Grade_pk id;
    private double grade;

    @EmbeddedId
    public Exercise_Grade_pk getId() {
        return id;
    }

    public void setId(Exercise_Grade_pk id) {
        this.id = id;
    }

    @Column(nullable = true)
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
