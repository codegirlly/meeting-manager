package com.ly.repository;

import com.ly.entity.ManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ManagerRepository extends JpaRepository<ManagerEntity,Integer>{
    @Query
    ManagerEntity findByName(String username);
}
