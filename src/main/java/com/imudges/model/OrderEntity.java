package com.imudges.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by cyy on 2016/10/26.
 */
@Entity
@Table(name = "order", schema = "test", catalog = "")
public class OrderEntity {
    private Integer customar_id;
    private Integer foodId;
    private String id;
    private Date time;
    private Integer all_price;

    @Basic
    @Column(name = "customar_id", nullable = false, length = 255)
    public Integer getCustomar() {
        return customar_id;
    }

    public void setCustomar(Integer customar_id) {
        this.customar_id = customar_id;
    }

    @Basic
    @Column(name = "all_price", nullable = false, length = 255)
    public Integer getAll_price() {
        return all_price;
    }

    public void setAll_price(Integer all_price) {
        this.all_price = all_price;
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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != that.id) return false;
        if (customar_id != null ? !customar_id.equals(that.customar_id) : that.customar_id != null) return false;
        if (foodId != null ? !foodId.equals(that.foodId) : that.foodId != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (all_price != that.all_price) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = customar_id!= null ? customar_id.hashCode() : 0;
        result = 31 * result + (foodId != null ? foodId.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (all_price != null ? all_price.hashCode() : 0);
        return result;
    }
}
