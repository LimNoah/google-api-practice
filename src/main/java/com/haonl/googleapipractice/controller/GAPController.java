package com.haonl.googleapipractice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GAPController {

    @GetMapping("/")
    public ResponseEntity<?> mainTest() {
        return ResponseEntity.ok("THIS IS MAIN TEST!!!");
    }

}
