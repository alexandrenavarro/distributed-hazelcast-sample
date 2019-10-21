package com.github.alexandrenavarro.distributedhazelcastsample;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {

    private final DataRepository dataRepository;

    @GetMapping("/api/{id}")
    public Data getData(@PathVariable("id") String a) {
        return  dataRepository.getData(a);
    }

    @PutMapping("/api/{id}")
    public Data saveData(@PathVariable("id") String a, @RequestBody Data data) {
        return dataRepository.saveData(data);
    }

}
