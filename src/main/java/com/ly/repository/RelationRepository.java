package com.ly.repository;

import com.ly.entity.RelationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationRepository extends JpaRepository<RelationEntity,RelationEntity.RelationPK> {
}
