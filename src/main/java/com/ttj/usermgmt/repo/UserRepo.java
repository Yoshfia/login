package com.ttj.usermgmt.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ttj.usermgmt.domain.UserEntity;


@Repository
public interface UserRepo extends CrudRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}