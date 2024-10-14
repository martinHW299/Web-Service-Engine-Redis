package com.boctool.ws_engine_redis.controller;

import com.boctool.ws_engine_redis.entity.Request;
import com.boctool.ws_engine_redis.entity.RequestDTO;
import com.boctool.ws_engine_redis.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/request")
public class RequestController {

    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public List<Request> findAllRequests() {
        return requestService.findAllRequests();
    }

    @PostMapping
    public ResponseEntity<Object> executeQuery(@RequestBody List<RequestDTO> requestDTOS) {
        return requestService.executeListQueries(requestDTOS);
    }

    @PostMapping("/deleteAll")
    public void deleteAllRequests() {
        requestService.deleteAllRequests();
    }
}
