package com.imudges.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by cyy on 2016/11/21.
 */
@Entity
@Table(name = "shoppingcar", schema = "test", catalog = "")
public class ShoppingcarEntity {
    private int id;
    private Integer customarId;
    private String allPrice;
    private Integer foodId;
    private Timestamp time;

    @Basic
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customar_id", nullable = true)
    public Integer getCustomarId() {
        return customarId;
    }

    public void setCustomarId(Integer customarId) {
        this.customarId = customarId;
    }

    @Basic
    @Column(name = "all_price", nullable = true, length = 255)
    public String getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(String allPrice) {
        this.allPrice = allPrice;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingcarEntity that = (ShoppingcarEntity) o;

        if (id != that.id) return false;
        if (customarId != null ? !customarId.equals(that.customarId) : that.customarId != null) return false;
        if (allPrice != null ? !allPrice.equals(that.allPrice) : that.allPrice != null) return false;
        if (foodId != null ? !foodId.equals(that.foodId) : that.foodId != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (customarId != null ? customarId.hashCode() : 0);
        result = 31 * result + (allPrice != null ? allPrice.hashCode() : 0);
        result = 31 * result + (foodId != null ? foodId.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
