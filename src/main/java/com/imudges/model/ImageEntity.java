package com.imudges.model;

import javax.persistence.*;

/**
 * Created by cyy on 2016/11/21.
 */
@Entity
@Table(name = "image", schema = "test", catalog = "")
public class ImageEntity {
    private int id;
    private String url;
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
    @Column(name = "url", nullable = false, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageEntity that = (ImageEntity) o;

        if (id != that.id) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (url != null ? url.hashCode() : 0);
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
