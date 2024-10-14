package com.boctool.ws_engine_redis.repository;

import com.boctool.ws_engine_redis.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RequestRepository extends JpaRepository<Request, String> {
}
