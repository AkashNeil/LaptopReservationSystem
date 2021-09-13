package io.github.seebaware.lrs.controller;

import io.github.seebaware.lrs.model.Laptops;
import io.github.seebaware.lrs.repository.LaptopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class LaptopsController {

    @Autowired
    LaptopsRepository laptopsRepository;

    @GetMapping("/laptops")
    public ResponseEntity<List<Laptops>> getAllLaptops() {
        try {

            List<Laptops> laptops = new ArrayList<>(laptopsRepository.findAll());

            if (laptops.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(laptops, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
