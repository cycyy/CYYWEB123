package com.imudges.utils;

import com.imudges.model.FoodEntity;
import com.imudges.model.ImageEntity;

/**
 * Created by cyy on 2016/11/21.
 */
public class Commodity {
    ImageEntity image;
    FoodEntity foodEntity;

    public ImageEntity getImage() {
        return image;
    }

    public void setImage(ImageEntity image) {
        this.image = image;
    }

    public FoodEntity getFoodEntity() {
        return foodEntity;
    }

    public void setFoodEntity(FoodEntity foodEntity) {
        this.foodEntity = foodEntity;
    }
}
