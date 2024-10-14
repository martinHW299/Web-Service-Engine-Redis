package com.boctool.ws_engine_redis.repository;

import com.boctool.ws_engine_redis.entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SourceRepository extends JpaRepository<Source, String> {
    Source findSourceBySourceId(String sourceId);

    List<Source> findSourceBySourceStatus(String status);

    boolean existsBySourceId(String sourceId);
}
