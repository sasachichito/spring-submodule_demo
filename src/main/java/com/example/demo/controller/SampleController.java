package com.example.demo.controller;

import demo.Library;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequiredArgsConstructor
@Controller
@RequestMapping("/samples")
public class SampleController {

    private final Library library;

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void sample(@PathVariable String id) {
        this.library.someLibraryMethod();
    }
}
