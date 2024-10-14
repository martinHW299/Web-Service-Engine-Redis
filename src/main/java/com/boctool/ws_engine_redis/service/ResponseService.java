package com.boctool.ws_engine_redis.service;

import com.boctool.ws_engine_redis.entity.Response;
import com.boctool.ws_engine_redis.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    private final ResponseRepository responseRepository;

    @Autowired
    public ResponseService(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }

    public void deleteAllResponses() {
        responseRepository.deleteAll();
    }

    public List<Response> findAllResponses() {
        return responseRepository.findAll();
    }
}
