package com.company;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/{name}")
    public NumerologicPortrait get(@PathVariable String name){
        NumerologicCalculator numerologicCalculator = new NumerologicCalculator();
        return numerologicCalculator.calculateName(name);
    }
}
