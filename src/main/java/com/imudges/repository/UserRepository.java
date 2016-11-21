package com.imudges.repository;

import com.imudges.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cyy on 2016/10/27.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>{
        public UserEntity findByEmail(String email);

}
