package com.mindfine.hibernate.orMapping.VO;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-19
 * Time: 下午7:26
 */
@Embeddable
public class Exercise_Grade_pk implements Serializable {
    private Exercise_Student sId;
    private Exercise_Course cId;

    @ManyToOne
    public Exercise_Student getsId() {
        return sId;
    }

    public void setsId(Exercise_Student sId) {
        this.sId = sId;
    }

    @ManyToOne
    public Exercise_Course getcId() {
        return cId;
    }

    public void setcId(Exercise_Course cId) {
        this.cId = cId;
    }

    @Override
    public boolean equals(Object pk2){
        Exercise_Grade_pk gpk2 = (Exercise_Grade_pk) pk2;
        if (this.sId.getId() == gpk2.sId.getId()){
            if(this.cId.getId() == gpk2.sId.getId()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = sId != null ? sId.hashCode() : 0;
        result += cId != null ? cId.hashCode() : 0;
        return result;
    }
}
