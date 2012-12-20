package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
