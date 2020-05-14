package com.levi.yoon.controller;

import com.levi.yoon.model.SampleRecord;
import com.levi.yoon.service.SampleRecordService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public record SampleController(SampleRecordService sampleRecordService) {
    @PostMapping("/")
    public Mono<SampleRecord> sampleRecord(@RequestBody SampleRecord sampleRecord) {
        System.out.println(sampleRecord.getInfo());
        return sampleRecordService.sampleRecordMono(sampleRecord);
    }
}
