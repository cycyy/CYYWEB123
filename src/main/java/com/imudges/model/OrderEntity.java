package com.imudges.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by cyy on 2016/10/26.
 */
@Entity
@Table(name = "order", schema = "test", catalog = "")
public class OrderEntity {
    private Integer customarid;
    private Integer foodId;
    private Integer id;
    private Timestamp time;
    private Integer all_price;



    @Basic
    @Column(name = "customarid", nullable = false, length = 255)
    public Integer getCustomarid() {
        return customarid;
    }

    public void setCustomarid(Integer customarid) {
        this.customarid = customarid;
    }

    @Basic
    @Column(name = "all_price", nullable = true, length = 255)
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
    public Timestamp getTime() {
        return time;
    }
    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (customarid != null ? !customarid.equals(that.customarid) : that.customarid != null) return false;
        if (foodId != null ? !foodId.equals(that.foodId) : that.foodId != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        return all_price != null ? all_price.equals(that.all_price) : that.all_price == null;

    }

    @Override
    public int hashCode() {
        int result = customarid != null ? customarid.hashCode() : 0;
        result = 31 * result + (foodId != null ? foodId.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (all_price != null ? all_price.hashCode() : 0);
        return result;
    }
}
