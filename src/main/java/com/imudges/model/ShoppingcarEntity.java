package com.imudges.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by cyy on 2016/11/21.
 */
@Entity
@Table(name = "shoppingcar", schema = "test", catalog = "")
public class ShoppingcarEntity {
    private int id;
    private String allprice;
    private Timestamp time;
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
    @Column(name = "allprice", nullable = true, length = 255)
    public String getAllprice() {
        return allprice;
    }

    public void setAllprice(String allprice) {
        this.allprice = allprice;
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
        if (allprice != null ? !allprice.equals(that.allprice) : that.allprice != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (allprice != null ? allprice.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
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
