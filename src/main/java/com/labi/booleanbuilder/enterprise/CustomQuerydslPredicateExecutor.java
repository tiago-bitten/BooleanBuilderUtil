package com.labi.booleanbuilder.enterprise;

import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface CustomQuerydslPredicateExecutor<T> extends QuerydslPredicateExecutor<T> {

    @Override
    List<T> findAll(Predicate predicate);

    default List<T> findAll(String filter, Class<?> clazz) {
        return findAll(BooleanBuilderUtil.buildPredicate(filter, clazz));
    }

    default Page<T> findAll(String filter, Class<?> clazz, Pageable pageable) {
        return findAll(BooleanBuilderUtil.buildPredicate(filter, clazz), pageable);
    }
}
