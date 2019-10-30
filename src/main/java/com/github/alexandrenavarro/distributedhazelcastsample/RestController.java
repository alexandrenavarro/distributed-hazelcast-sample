package com.github.alexandrenavarro.distributedhazelcastsample;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {

    private final DataService dataService;

    @GetMapping("/api/{id}")
    public Data getData(@PathVariable("id") String a) {
        return  dataService.getData(a);
    }

    @PutMapping("/api/{id}")
    public Data saveData(@PathVariable("id") String a, @RequestBody Data data) {
        return dataService.saveData(data);
    }

}
