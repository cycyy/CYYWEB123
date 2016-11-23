package com.imudges.repository;

import com.imudges.model.ShoppingcarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cyy on 2016/11/21.
 */
@Repository
public interface ShoppingcarRespository extends JpaRepository<ShoppingcarEntity,Integer> {
    public ShoppingcarEntity findByCookie(String email);
}
