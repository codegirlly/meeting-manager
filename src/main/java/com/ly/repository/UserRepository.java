package com.ly.repository;

import com.ly.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<UserEntity,Integer> {
  @Query
  UserEntity findByUserName(String userName);
}
