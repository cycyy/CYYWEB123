package com.imudges.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by cyy on 2016/11/21.
 */
@Entity
@Table(name = "indent", schema = "test", catalog = "")
public class OrderEntity {
    private int id;
    private String time;
    private Integer price;
    private UserEntity userByCustomarid;
    private FoodEntity foodByFoodid;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "price", nullable = true)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != that.id) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "customarid", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByCustomarid() {
        return userByCustomarid;
    }

    public void setUserByCustomarid(UserEntity userByCustomarid) {
        this.userByCustomarid = userByCustomarid;
    }

    @ManyToOne
    @JoinColumn(name = "foodid", referencedColumnName = "id")
    public FoodEntity getFoodByFoodid() {
        return foodByFoodid;
    }

    public void setFoodByFoodid(FoodEntity foodByFoodid) {
        this.foodByFoodid = foodByFoodid;
    }
}
