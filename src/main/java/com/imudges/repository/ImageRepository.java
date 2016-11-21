package com.imudges.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cyy on 2016/11/21.
 */
public interface ImageRepository extends JpaRepository<ImageEntity,Integer> {
    public ImageEntity FindByFoodid
}
