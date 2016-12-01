package com.imudges.repository;

import com.imudges.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cyy on 2016/11/20.
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {


}
