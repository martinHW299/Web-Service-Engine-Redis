package com.boctool.ws_engine_redis.controller;

import com.boctool.ws_engine_redis.entity.Source;
import com.boctool.ws_engine_redis.service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/source")
public class SourceController {

    private final SourceService sourceService;

    @Autowired
    public SourceController(SourceService sourceService) {
        this.sourceService = sourceService;
    }

    @GetMapping
    public List<Source> findAllSources() {
        return sourceService.findAllSources();
    }

    @GetMapping("/id/{id}")
    public Source findSourceById(@PathVariable String id) {
        return sourceService.findSourceById(id);
    }

    @GetMapping("/status/{status}")
    public List<Source> findSourcesByStatus(@PathVariable String status) {
        return sourceService.findSourcesByStatus(status);
    }

    @PostMapping
    public void saveSources(@RequestBody List<Source> sources) {
        sourceService.saveListOfSources(sources);
    }

    @PostMapping("/deleteAll")
    public void deleteAllSources() {
        sourceService.deleteAllSources();
    }
}