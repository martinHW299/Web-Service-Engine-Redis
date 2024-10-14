package com.boctool.ws_engine_redis.controller;

import com.boctool.ws_engine_redis.entity.Query;
import com.boctool.ws_engine_redis.entity.QueryDTO;
import com.boctool.ws_engine_redis.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/query")
public class QueryController {

    private final QueryService queryService;

    @Autowired
    public QueryController(QueryService queryService) {
        this.queryService = queryService;
    }

    @GetMapping
    public List<Query> findAllSources() {
        return queryService.findAllQueries();
    }

    @PostMapping
    public ResponseEntity<Object> saveQuery(@RequestBody List<QueryDTO> queryDTOS) {
        return queryService.saveQueries(queryDTOS);
    }

    @PostMapping("/deleteAll")
    public void deleteAllQueries() {
        queryService.deleteAllQueries();
    }

}
