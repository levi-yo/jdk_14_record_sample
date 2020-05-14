package com.levi.yoon.service;

import com.levi.yoon.model.SampleRecord;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SampleRecordService {

    public Mono<SampleRecord> sampleRecordMono(SampleRecord sampleRecord) {
        return Mono.just(sampleRecord);
    }
}
