package com.boctool.ws_engine_redis.repository;

import com.boctool.ws_engine_redis.entity.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryRepository extends JpaRepository<Query, String> {
    Query findQueryByQueryMd5(String md5);

    boolean existsQueryByQueryMd5(String md5);

    boolean existsByQueryId(String id);

    Query findQueryByQueryId(String id);
}
