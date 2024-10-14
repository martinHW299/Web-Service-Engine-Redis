package com.boctool.ws_engine_redis.repository;

import com.boctool.ws_engine_redis.entity.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response, String> {
}
