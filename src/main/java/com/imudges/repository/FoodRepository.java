package com.imudges.repository;

import com.imudges.model.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cyy on 2016/11/21.
 */
public interface FoodRepository extends JpaRepository<FoodEntity,Integer> {

}
