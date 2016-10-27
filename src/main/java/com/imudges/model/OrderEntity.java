package com.imudges.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cyy on 2016/10/26.
 */
@Entity
@Table(name = "order", schema = "test", catalog = "")
public class OrderEntity {
    private String customar;
    private Integer foodId;
    private int id;
    private Date time;

    @Basic
    @Column(name = "customar", nullable = false, length = 255)
    public String getCustomar() {
        return customar;
    }

    public void setCustomar(String customar) {
        this.customar = customar;
    }

    @Basic
    @Column(name = "food_id", nullable = true)
    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != that.id) return false;
        if (customar != null ? !customar.equals(that.customar) : that.customar != null) return false;
        if (foodId != null ? !foodId.equals(that.foodId) : that.foodId != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customar != null ? customar.hashCode() : 0;
        result = 31 * result + (foodId != null ? foodId.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
