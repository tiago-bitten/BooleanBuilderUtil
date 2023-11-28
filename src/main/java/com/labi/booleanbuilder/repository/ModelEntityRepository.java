package com.labi.booleanbuilder.repository;

import com.labi.booleanbuilder.enterprise.CustomQuerydslPredicateExecutor;
import com.labi.booleanbuilder.model.ModelEntity;
import org.springframework.boot.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelEntityRepository extends JpaRepository<ModelEntity, Long>, CustomQuerydslPredicateExecutor<ModelEntity> {
}
