package com.imudges.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by cyy on 2016/11/21.
 */
@Entity
@Table(name = "food", schema = "test", catalog = "")
public class FoodEntity {
    private int id;
    private String name;
    private String kind;
    private Integer price;
    private List<ImageEntity> imagesById;
    private List<OrderEntity> ordersById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "kind", nullable = true, length = 255)
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

        FoodEntity that = (FoodEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "foodByFoodid")
    public List<ImageEntity> getImagesById() {
        return imagesById;
    }

    public void setImagesById(List<ImageEntity> imagesById) {
        this.imagesById = imagesById;
    }

    @OneToMany(mappedBy = "foodByFoodid")
    public List<OrderEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(List<OrderEntity> ordersById) {
        this.ordersById = ordersById;
    }
}
